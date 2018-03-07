def circleArea(r : Double) = {Math.PI * r *r}
val a = circleArea(10)
def cricle(r : String) = {val rd = r.toDouble; Math.PI*rd*rd}
val a2 = cricle("3")
@annotation.tailrec
def stair(i : Double) : Double = {
  if (i > 50) {println("end"); i}
  else {println(i); stair(i+5)}
}
stair(1.3)
def clock(t : Double) = {
  val s = t/1000
  val m = s/60
  val h = m/60
  val d = h/24
  println(s"$d Day $h hours $m min $s sec")
}
clock(3600)
def power (i : Int, j : Int) : Int = {
  if (i <= 1) j
  else j * power(i-1, j)
}
power(3,5)
val x = (2,3)
val y = (4,5)
def distance (x : (Int,Int), y : (Int, Int)) : Double = {
  def multi(a: Int, b:Int) :Int = {(a-b) * (a-b)}
  Math.sqrt(multi(x._1, y._1) + multi(x._2, y._2))
}
distance(x,y)
def typeToString [A,B,C] (x: (A,B,C)) : (A, String, B, String, C, String) = {
  (x._1, x._1.toString, x._2, x._2.toString, x._3, x._3.toString )
}
typeToString((true, 22.25, "yes"))
val t = typeToString(("Hello", false, 23))