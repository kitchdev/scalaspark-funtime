object LearningScala2 {
  // Flow control
  
  // If / else syntax
  if (1 > 3) println("Impossible!") else println("The world makes sense.")
                                                  //> The world makes sense.
  
  if (1 > 3) {
  	println("Impossible!")
  } else {
  	println("The world makes sense.")
  }                                               //> The world makes sense.
  
  // Matching - like switch in other languages:
  val number = 4                                  //> number  : Int = 4
  number match {
  	case 1 => println("One")
  	case 2 => println("Two")
  	case 3 => println("Three")
  	case _ => println("Something else")
 	}                                         //> Something else
 	
 	// For loops
 	for (x <- 1 to 4) {
 		val squared = x * x
 		println(squared)
 	}                                         //> 1
                                                  //| 4
                                                  //| 9
                                                  //| 16
                                                  
  // While loops
  var x = 10                                      //> x  : Int = 10
  while (x >= 0) {
  	println(x)
  	x -= 1
  }                                               //> 10
                                                  //| 9
                                                  //| 8
                                                  //| 7
                                                  //| 6
                                                  //| 5
                                                  //| 4
                                                  //| 3
                                                  //| 2
                                                  //| 1
                                                  //| 0
                                                  
  x = 0
  do { println(x); x+=1 } while (x <= 10)         //> 0
                                                  //| 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 7
                                                  //| 8
                                                  //| 9
                                                  //| 10
                                                  
   // Expressions
   // "Returns" the final value in a block automatically
   
   {val x = 10; x + 20}                           //> res0: Int = 30
                                                
	 println({val x = 10; x + 20})            //> 30
	 
	 // EXERCISE
	 // Write some code that prints out the first 10 values of the Fibonacci sequence.
	 // This is the sequence where every number is the sum of the two numbers before it.
	 // So, the result should be 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
	 var baseNum: Int = 0                     //> baseNum  : Int = 0
	 for(x <- 0 to 10) {
	 		if (x <= 1) {
	 			println(x)
	 		} else {
	 			println({x-1 + x-2})
	 		}                         //> 0
                                                  //| 1
                                                  //| 1
                                                  //| 3
                                                  //| 5
                                                  //| 7
                                                  //| 9
                                                  //| 11
                                                  //| 13
                                                  //| 15
                                                  //| 17
	 }
	 
	 var m = 0                                //> m  : Int = 0
 	 var n = 1                                //> n  : Int = 1
 	 print(s"$m, $n, ")                       //> 0, 1, 
 
 
	 for (x <- 1 to 10) {
		 var o = m+n
		 println(s"$o ,")
		 m = n
		 n = o
	 }                                        //> 1 ,
                                                  //| 2 ,
                                                  //| 3 ,
                                                  //| 5 ,
                                                  //| 8 ,
                                                  //| 13 ,
                                                  //| 21 ,
                                                  //| 34 ,
                                                  //| 55 ,
                                                  //| 89 ,
}