object LearningScala2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(141); 
  // Flow control
  
  // If / else syntax
  if (1 > 3) println("Impossible!") else println("The world makes sense.");$skip(96); 
  
  if (1 > 3) {
  	println("Impossible!")
  } else {
  	println("The world makes sense.")
  };$skip(68); 
  
  // Matching - like switch in other languages:
  val number = 4;System.out.println("""number  : Int = """ + $show(number ));$skip(146); 
  number match {
  	case 1 => println("One")
  	case 2 => println("Two")
  	case 3 => println("Three")
  	case _ => println("Something else")
 	};$skip(87); 
 	
 	// For loops
 	for (x <- 1 to 4) {
 		val squared = x * x
 		println(squared)
 	};$skip(81); 
                                                  
  // While loops
  var x = 10;System.out.println("""x  : Int = """ + $show(x ));$skip(47); 
  while (x >= 0) {
  	println(x)
  	x -= 1
  };$skip(59); 
                                                  
  x = 0;$skip(42); 
  do { println(x); x+=1 } while (x <= 10);$skip(154); val res$0 = 
                                                  
   // Expressions
   // "Returns" the final value in a block automatically
   
   {val x = 10; x + 20};System.out.println("""res0: Int = """ + $show(res$0));$skip(82); 
                                                
	 println({val x = 10; x + 20});$skip(272); 
	 
	 // EXERCISE
	 // Write some code that prints out the first 10 values of the Fibonacci sequence.
	 // This is the sequence where every number is the sum of the two numbers before it.
	 // So, the result should be 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
	 var baseNum: Int = 0;System.out.println("""baseNum  : Int = """ + $show(baseNum ));$skip(101); 
	 for(x <- 0 to 10) {
	 		if (x <= 1) {
	 			println(x)
	 		} else {
	 			println({x-1 + x-2})
	 		}
	 };$skip(19); 
	 
	 var m = 0;System.out.println("""m  : Int = """ + $show(m ));$skip(13); 
 	 var n = 1;System.out.println("""n  : Int = """ + $show(n ));$skip(22); 
 	 print(s"$m, $n, ");$skip(84); 
 
 
	 for (x <- 1 to 10) {
		 var o = m+n
		 println(s"$o ,")
		 m = n
		 n = o
	 }}
}
