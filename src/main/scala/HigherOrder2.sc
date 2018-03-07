val doubler: Int => Int = _ * 2
val doubler2 = (x: Int) => x * 2
doubler2(2)
val safeStringOp = (s: String, f: String => String) => if (s != null) f(s) else s
safeStringOp("Ready", _.reverse)
safeStringOp(null, _.reverse)
def combination(x: Int, y: Int, f: (Int, Int) => Int) = f(x, y)
combination(23, 13, _ * _)
val combination2 = (x: Int, y: Int, f: (Int, Int) => Int) => f(x, y)
combination2(23, 13, _ * _)
def tripleOp(a: Int, b: Int, c: Int, f: (Int, Int, Int) => Int) = f(a, b, c)
tripleOp(23, 92, 14, _ * _ + _)
def tripleOp2[A, B](a: A, b: A, c: A, f: (A, A, A) => B) = f(a, b, c)
tripleOp2[Int, Int](23, 94, 14, _ * _ + _)
tripleOp2[Int, Double](23, 94, 14, 1.0 * _ / _ / _)
tripleOp2[Int, Boolean](93, 92, 14, _ > _ + _)
def factorOf(x: Int, y: Int) = y % x == 0
val f = factorOf _
val x = f(7, 20)
val multipleOf3 = factorOf(3, _: Int)
val y = multipleOf3(78)
