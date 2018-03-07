for(x <- 1 to 7) {println(s"Day $x")}
for(x <- 1 to 7) yield {
  s"Day $x:"
}
for(day <- res1) {print(day+", ")}
val threes = for( i <- 1 to 20 if i % 3 ==0) yield i
val quote = "Faith, Hope, Charity"
for {
  t <- quote.split(",")
  if t != null
  if t.size > 0
} {println(t)}
for { x <- 1 to 2
       y <- 1 to 3}
      {print(s"($x,$y) ")}
val powersOf2 = for(i <- 0 to 8; pow = 1 << i) yield pow
var x = 10
while(x > 0 ) x-= 1
val y = 0
do println(s"Here I am, x = $x") while(y > 0)