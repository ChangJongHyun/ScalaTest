/*Page 94 problem.1*/
val max = (x: Int, y: Int) => if (x>y) x else y
def max3 (x: (Int,Int,Int), f: (Int,Int) => Int) = f(x._1, f(x._2, x._3))
val maximize = max3((2,3,1), max)
/*problem.2 어렵다...*/
def max2 (x: Int, y: Int, f: (Int, Int) => Int) = {
}
/*problem.3*/
def multiplier(x: Int) = {(y: Int) => y*x}
val multi = multiplier(3)
val f3 = multi(5)
/*problem.4*/
def fzero[A](x:A)(f: A => Unit) : A = {f(x); x}
/*problem.5*/
def square(m: Double) = m*m
val sq = square _
sq(3)
val sq2 : (Double) => (Double) = square
sq2(5)
/*problem.6*/
def conditional[A](x:A, p: A => Boolean, f: A => String): String  = {
  if(p(x)) f(x)
  else x.toString
}
/*problem.7*/
val factor3 = conditional[Int](_:Int, _ % 3 == 0, _ => "type")
val factor5 = conditional[Int](_: Int, _ % 5 == 0, _ => "safe")