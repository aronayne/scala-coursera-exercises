package week2

object exercise {
 
 	def factorial(n: Int): Int = {
 		def loop(acc: Int, n : Int): Int =
 			if(n == 0) acc
 				else {
 					println("acc : "+acc +" , n : "+n)
 					//println("calling loop(acc * "+n+","+ n +" - 1)")
 					loop(acc * n, n - 1)
 				}
 		loop(1 , n)
 	}                                         //> factorial: (n: Int)Int
 	
 	factorial(4)                              //> acc : 1 , n : 4
                                                  //| acc : 4 , n : 3
                                                  //| acc : 12 , n : 2
                                                  //| acc : 24 , n : 1
                                                  //| res0: Int = 24
 }