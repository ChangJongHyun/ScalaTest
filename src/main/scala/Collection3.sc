val one = List(0,1,0) collect {case 1 => "OK"}
List("milk,tea").flatMap(_.split(","))
List("milk", "tea") map (_.toUpperCase)
List(41, 59, 26).max
List(10.9, 32.5, 4.23, 5.67).min
List(5,6,7).product
List(11.3, 23.5, 7.2).sum
List(24, 17, 32) forall( _ < 18)
val validations = List(true, true, false, true, true, true)
val validl = ! (validations contains false)
val valid2 = validations forall (_ == false)
val valid3 = validations.exists(_ == false) == false
def contains (x: Int, l:List[Int]) : Boolean = {
  var a: Boolean = false
  for(i <- l) { if (!a) a = (i == x)}
  a
}
def contains2 (l: List[Int], start: Boolean)(f: (Boolean, Int) => Boolean) : Boolean = {
  var a =start
  for(i <- l) a = f(a,i)
  a
}
val included = contains2(List(46,19,92), false){(a,i) => if(a) a else (i == 19)}
def reduceOp[A,B](l: List[A], start: B)(f:(B,A) => B) : B = {
  var a = start
  for(i <- l) a = f(a,i)
  a
}
val reduce = reduceOp(List(46, 19, 92), false) {(a,i) => if (a) a else i == 19 }
val reduce2 = reduceOp(List(11.3, 23.5, 7.2), 0.0)(_ + _)
