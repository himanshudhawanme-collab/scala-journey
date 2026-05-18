val revenue = List(1000.0,2500.0,800.0,3200.0)
val afterTax = revenue.map(r => r*0.9)

val columns = List("User ID","Event Type","Timestamp")
val normalized = columns.map(c => c.toLowerCase.replace(" ","_"))
//List append
val appList = normalized ++ List("description")
println(s"List:$appList")