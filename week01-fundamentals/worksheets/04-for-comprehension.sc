val tables = List("bronze_orders","silver_orders","gold_revenue")

//for-comperhension adds the yeild keyword, now instead of doing something, you're producing a new collection. It returns a value
val upperTables = for table <- tables yield table.toUpperCase
//output: upperTables: List("BRONZE_ORDERS", "SILVER_ORDERS", "GOLD_REVENUE")


//for-comperhension can have multiple <- lines (called generators). This is where it goes beyond a simple map
val regions = List("Mumbai","Delhi","Bangalore")
val products = List("Laptop","Phone")
val combinations = for
  region <- regions
  product <- products
yield s"$region - $product"
//out:
// List(
//   "Mumbai - Laptop",   "Mumbai - Phone",
//   "Delhi - Laptop",    "Delhi - Phone",
//   "Bangalore - Laptop","Bangalore - Phone"
// )

//Data Engineering Example
val years  = List(2023, 2024)
val months = List("01", "02", "03")
val env    = "prod"

val partitionPaths = for
  year  <- years
  month <- months
yield s"s3://$env-bucket/orders/year=$year/month=$month/"

partitionPaths.foreach(println)
//out:
// s3://prod-bucket/orders/year=2023/month=01/
// s3://prod-bucket/orders/year=2023/month=02/
// s3://prod-bucket/orders/year=2023/month=03/
// s3://prod-bucket/orders/year=2024/month=01/
// ... and so on