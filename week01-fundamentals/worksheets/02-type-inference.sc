val recordCount : Int = 1_000_000 //underscores in numeric literals are purely a visual separator — the compiler completely ignores them.
val avgSalary = 8500.50
val isActive = true
val department = "Engineering"
val numFloat : Float = 1.23456745  // 1.2345674   ← notice rounding at 7th digit
val numDouble : Double = 1.23456745 // 1.23456745  ← full precision preserved

println(s"$numFloat ")
println(s"$numDouble")

println(s"$department has $recordCount records")