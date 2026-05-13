val pipeline = "bronze -> silver -> gold"
var rowCount = 1000

rowCount = 2000 // works - var
//pipeline = "changed" // uncomment to see error

println(pipeline)
println(rowCount)