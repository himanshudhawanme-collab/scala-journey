val events = List(
  ("click",1200,100), ("scroll",50,200), ("purchase",8900,300), ("click",300,400)
)
println(events)

val highValue = events.filter(_._2 > 500) // filter on second value
println(highValue)


val event = events.filter(_._1 == "scroll") // filter on first value
println(event)