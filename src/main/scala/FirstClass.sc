def double(x:Int) : Int = x*2
double(5)
val myDouble: (Int) => Int = double
myDouble(5)
val myDoubleCopy = myDouble
myDoubleCopy(5)
val myDouble2 = double _
val amount = myDouble2(20)
def max(a: Int, b: Int) = if (a > b) a else b
val maximize : (Int, Int) => Int = max
maximize(20,30)
def logStart() = "=" * 50 + "\nStarting Now\n" + "=" * 50
val start : String = logStart()
println(start)
def memoize[A,B](f: A => B) = new (A => B) {
  val cache = scala.collection.mutable.Map[A,B]()
  def apply(x:A):B = cache.getOrElseUpdate(x, f(x))
}