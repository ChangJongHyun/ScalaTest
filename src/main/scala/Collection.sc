val numbers = List(32, 95, 24, 21, 17)
val colors = List("red", "green", "blue")
println(s"I have ${colors.size} colors: $colors")
colors.head
colors.tail
colors(1)
var total = 0; for(i <- numbers) { total += i}
for (c <- colors) {println(c)}
colors.foreach( f => println(f))
val sizes = colors.map(c => c.length)
val total2 = numbers.reduce((a:Int, b: Int) => a+b)
val unique = Set(10, 20, 30, 20, 20, 10)
val sum = unique.reduce((a:Int, b:Int) => a+b)
val colorMap = Map("red" -> 0xFF0000, "green" -> 0xFF00, "blue" -> 0xFF)
val redRGB = colorMap("red")
val cyanRGB = colorMap("green") | colorMap("blue")
val hasWhite = colorMap.contains("white")
for(pairs <- colorMap) {println(pairs)}
val oddsAndEvents = List(List(1,3,5), List(2,4,6))
val keyValues = List(('A',65),('B',66),('C',67))
val primes = List(2,3,5,7,11,13)
val first = primes(0)
val fourth = primes(3)
val remaining = primes.tail // head 이외의 나머지
var i = primes
while(!i.isEmpty) {print(i.head + ", "); i = i.tail}
