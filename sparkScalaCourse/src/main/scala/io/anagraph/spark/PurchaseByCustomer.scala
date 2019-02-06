package io.anagraph.spark

import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.log4j._

object PurchaseByCustomer {
  
  def parseLine(line:String)= {
    val fields = line.split(",")
    val customerId = fields(0).toInt
    val amountSpent = fields(2).toFloat
   
    (customerId, amountSpent)
  }
  
  def main(args: Array[String]) {
    
    Logger.getLogger("org").setLevel(Level.ERROR)
    
    val sc = new SparkContext("local[*]", "PurchaseByCustomer")
    
    val input = sc.textFile("../customer-orders.csv")
    
    val custTuples = input.map(parseLine)
    val reducedTuples = custTuples.reduceByKey((x,y) => x + y).sortByKey()
    val results = reducedTuples.collect()
    
    
    val locale = new java.util.Locale("en", "CA")
    val formatter = java.text.NumberFormat.getCurrencyInstance(locale)

    val formatRes: ((Int, Float)) => ((Int, String)) = {
        case (a,b) => ((a, formatter.format(b)))
    }
    
    val resultsFormatted = results.map(formatRes)


    resultsFormatted.foreach(println)
    
    sc.stop()
    
  }
}
