val primes = List(2,3,5,7,11,13)
def visit(i: List[Int]) {if (i.size > 0) {print(i.head+", "); visit(i.tail)}}
visit(primes)
var i= primes
while(i != Nil) {print(i.head+", "); i = i.tail} // 모든 리스트의 종점은 nil
val l : List[Int] = List()
l == Nil
val m : List[String] = List("a")
m.head
m.tail == Nil
primes.partition( _ > 5)
primes.slice(1,3) // (i,j) -> i번째 인덱스 to j-1 인덱스까지
primes.slice(2,5)
val primesS = List("two", "three", "five")
primes zip primesS
primes take 3
primes.sorted
primes.dropWhile(_ > 5)
val appended = List(1, 2, 3, 4) :+ 5
val suffix = appended takeRight 3
val middle = appended dropRight 2
val f = List(23, 8, 14, 21) filter (_>18)
