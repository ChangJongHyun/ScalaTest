val anInt = 5
val yellowRgb = 0xffff00
val id = 100l
val pi = 3.1416
val hello = "Hello"+ ", Scala"
val signature = "With Regards, \nYour friend"
val matched = hello == "Hello, Scala"
val theme = "Na " * 16 + "Batman!"
val approx = 355/113f
println("Pi, using 355/133, is about" + approx +".")
val item = "apple"
println(s"Pi, using 355/133, is about $approx.")
s"How do you like them ${item}s?"
s"File n chis n vineger, ${"pepper "*3}salt"
f"I wore a new $item%.3s today"
f"Enjoying this $item ${355/113.0}%.5f times today"
val input = "Enjoying this apple 3.14159 times today"
val pattern = """.* apple ([\d.]+) times .*""".r
val pattern(amountText) = input
val amount = amountText.toDouble
val c = 'a'
val i : Int = c
val t : Char = 116
val isTrue = !true
val isFalse = !true
val unequal = (5 != 6)
val isLess = (5 < 6)
// &&는 첫번째 인자로만 충분하면 나머지검사x &은 전부검사
val unequalAndLess = unequal & isLess
val definitelyFalse = false && unequal
val nada = ()
val info = (5, "Korben", true)
val name = info._2
val red = "red" -> "0xff0000"
val reversed = red._2 -> red._1
val cel = 22
val toD = 22*9/5
val toDRe = toD +32
val dal : Double = 2.7255
val str = f"You owe $$${dal}%.2f ."
val num = 128
val numC = num.toChar
val numS = num.toString
val numD = num.toDouble
def max(x: Int, y: Int) : Int = {
  if(x>y)
    x
  else
    y
}
val myMax = max(2,3)
if( 47 % 3 > 0) println("Not a multiple of 3")
val result = if (false) "what does this return"
val x = 10; val y =20;
val my = max(x,y)