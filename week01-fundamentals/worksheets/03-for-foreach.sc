val rowCount: Int = 5_20_000
val status: String = if rowCount>=1_00_00 then "Large Table"
                     else if rowCount<=50_000 then "Medium Table"
                     else "Small Table"

// if is the ternary operator (conditional statement)
println(s"$rowCount rows -> $status")

val tables =  List("bronze_orders","silver_orders","gold_revenue")
tables.foreach(t => println(s"FOREACH: Processing: $t")) //use foreach statement


for i <-0 to tables.length-1 do println(s"FOR: Processing: ${tables(i)}") // use for statement