val dailySales = List(4200,3800,5100,4700,6288)

val totalRevenue = dailySales.reduce(_+_) // reduce collapase value to a single value
//out: 24088

val peakSale = dailySales.reduce((a,b) => if(a>b) a else b)
//out: 6288

val total = dailySales.foldLeft(10.0)(_+_) //Use fold when you need a starting
//out: 24098.0