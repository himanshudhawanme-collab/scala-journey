val transactions = List(120.5,340.5,200.8,333.2,120.5,"user01") //ordered,allowed duplicates, allowed multiple data types and immutable
println(s"List:$transactions")

val userRegion = Map(
  "user_01" -> "US",
  "user_02" -> "EMEA",
  "user_03" -> "APAC"
) // key value pairs, like a python dict but immutable by default
println(s"Map:$userRegion")

val activeUsers = Set("user_01","user_02","user_03","user_01") // unordered, no duplicates. Useful for deduplication
println(s"Set:$activeUsers")
