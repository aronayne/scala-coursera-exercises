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
 	
 	factorial(5)                              //> acc : 1 , n : 5
                                                  //| acc : 5 , n : 4
                                                  //| acc : 20 , n : 3
                                                  //| acc : 60 , n : 2
                                                  //| acc : 120 , n : 1
                                                  //| res0: Int = 120
 }