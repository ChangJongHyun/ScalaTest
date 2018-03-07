def safeStringOp(s: String, f: String => String) = {
  if(s != null) f(s) else s
}
def reverser(s: String) = s.reverse
safeStringOp(null, reverser)
safeStringOp("Ready", reverser)
val doubler = (x: Int) => x*2
val myDouble = doubler(2)
val greeter = (name: String) => s"Hello, $name"
greeter("ChangJong")
def max(a: Int, b: Int) = if(a>b) a else b
val maximize : (Int, Int) => Int = max
val maximize2 = (x: Int, y: Int) => if(x>y) x else y
max(2,3)
maximize(2,3)
maximize2(2,3)
val start = () => "=" * 50 + "\nStart!\n"+"=" * 50
println(start())
val safeString = (s : String, f :String => String) => if(s != null) f(s) else s
safeString(null, s => s.reverse)
safeString("Ready", s => s.reverse)