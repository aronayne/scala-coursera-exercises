package week2

object LectureTwoPointThree {
  def product(f: Int => Int)(a: Int, b: Int): Int =
  	if(a > b) 1
  	else {
  	//  println("a : "+a+",b : "+b)
  	  println(f(a))
  	//  println(product(f)(a + 1, b))
  	//  println(f(a) * product(f)(a + 1, b))
  		f(a) * product(f)(a + 1, b)
  	}                                         //> product: (f: Int => Int)(a: Int, b: Int)Int
  product(x => x * x)(3 , 5)                      //> 9
                                                  //| 16
                                                  //| 25
                                                  //| res0: Int = 3600
}