def hi = "hi"
hi
def hi2 : String = "hi"
hi2
hi2
def multiplier(x: Int, y: Int) : Int = { x * y}
multiplier(3, 4)
def safeTrim(s : String) : String = {
if (s==null) null
else s.trim()
}
val trimed = safeTrim("Hello Scala!")
def log(d : Double) = println(f"Got value $d%.2f")
log(2.23535)
def formatEuro(amt : Double) = f"$$$amt%.2f"
formatEuro(3.4645)
formatEuro { val rate = 1.32; 0.235 + 0.7123 + rate*5.32}
// stack overflow 조심 스칼라 꼬리재귀
def power(x: Int, n: Int): Long = {
  if (n<1) 1
  else x * power(x,n-1)
}
power(2,8)
def max(a: Int, b: Int, c:Int) = {
  def max(x: Int, y: Int) = if (x>y) x else y
  max(a,max(b,c))
}
max(42,181,19)
def greet(prefix: String, name: String) = s"$prefix $name"
val greeting1 = greet("Ms", "Brown")
val greeting2 = greet(name = "Brown", prefix = "Ms")
def greet2(name : String, prefix: String = "Ms") = s"$prefix $name"
greet2("Ola")
def sum(items: Int*) : Int = {
  var total  = 0
  for(i <- items) total+=i
  total
}
sum(30, 20, 10, 5)
sum()
def max(x: Int)(y: Int) = if (x>y) x else y
val larger = max(29)(30)
