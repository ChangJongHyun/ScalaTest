val msg = "ok"
val status = msg match {
  case "ok" => 200
  case other => {
    println(s"Couldn't parse $other")
    -1
  }
}
val msg2 = "Unauthorized"
val status2 = msg2 match {
  case "ok" => 200
  case _ => { // _ => msg2
    println(s"Couldn't parse $msg2")
    -1
  }
}
val response:String = null
response match {
  case a if a != null => println(s"Received $a")
  case a => println("Error! Recieved a null response")
}
val x : Int = 12180
val y : Any = x
y match {
  case a : String => s"'a"
  case a : Double => f"$a%.2f"
  case a : Float => f"$a%.2f"
  case a : Long => s"${a}l"
  case a : Int => s"${x}i"
}
