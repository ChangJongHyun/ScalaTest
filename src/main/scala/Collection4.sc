val included = List(46, 19, 92).foldLeft(false) {(a,i) => if(a) a else i==19}
import collection.JavaConverters._
List(12,29).asJava
val statuses = List(500, 404)
val msg = statuses.head match {
  case x if x < 500 => "Okay"
  case _ => "whoah, an eror"
}
val msg2 = statuses match {
  case List(500, x) => s"Error followed by $x"
  case List(e, x) => s"$e was followed by $x"
}
val answer = List(11,3, 23.5, 7.2).reduceLeft(_+_)
val head = List('r', 'g', 'b') match {
  case x:: xs => x
  case Nil => ' '
}
