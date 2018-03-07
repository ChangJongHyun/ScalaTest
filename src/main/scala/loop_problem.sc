val name : String = null
val isSame = name match {
  case n  if n != null => n
  case other  => {"n/a"}
}
val amount : Double = -1
val sign = amount match {
  case d if d > 0 => "grater"
  case d if d == 0 => "same"
  case d if d < 0 => "less"
}
val sign2 = { if (amount > 0) "greater"
else
  if (amount == 0) "same"
else "less"}
val color = "yellow"
val hex = color match {
  case "yellow" => 0xffff00
  case "magenta" => 0xff0000
  case "cyan" => 0xffffff
  case _ => {println(s"$color is not Color"); -1}
}
for(i <- 1 to 100) { if (i%5 == 0) println(i)
else print(i+" ")}
// 1줄로 줄여보자..
for(i <- 1 to 100) { i match {
  case i if i%15 == 0 => println("typesafe")
  case i if i%3 == 0 => println("type")
  case i if i%5 == 0 => println("safe")
  case other => println(s"$other")
  }
}