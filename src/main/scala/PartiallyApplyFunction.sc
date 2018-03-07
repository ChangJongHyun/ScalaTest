def factorOf(x: Int)(y: Int) = y % x == 0
val isEven = factorOf(2) _
isEven(4)
def doubles( x: => Int) = {
  println("Now doubling " + x)
  x * 2
}
doubles(5)
def f(i : Int) = { println(s"Hello from f($i)"); i}
doubles(f(8))
val statusHandler: Int => String = {
  case 200 => "Okay"
  case 400 => "Your Error"
  case 500 => "Our Error"
}
statusHandler(200)
statusHandler(400)
statusHandler(500)
statusHandler(401)
def safeStringOp(s: String, f: String => String) = {
  if ( s != null) f(s) else s
}
val uuid = java.util.UUID.randomUUID.toString
val timedUUID = safeStringOp(uuid, { s =>
  val now = System.currentTimeMillis
  val timed = s.take(24) + now
  timed.toUpperCase
})
def safeStringOp2(s: String)(f: String => String) = {
  if (s != null) f(s) else s
}
val timedUUID2 = safeStringOp2(uuid) { s =>
  val now = System.currentTimeMillis
  val timed = s.take(24) + now
  timed.toUpperCase
}
def timer[A] (f: A): A = {
  def now = System.currentTimeMillis
  val start = now; val a = f; val  end = now
  println(s"Executed in ${end-start} ms")
  a
}
val veryRandomAmount = timer {
  util.Random.setSeed(System.currentTimeMillis)
  for( i <- 1 to 100000) util.Random.nextDouble
  util.Random.nextDouble
}
