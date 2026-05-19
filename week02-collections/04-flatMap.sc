val userPurchases = List(
  ("user_001",List("prod_A","prod_B")),
  ("user_002",List("prod_C")),
  ("user_003", List("prod_A","prod_D","prod_E"))
)

val exploded = userPurchases.flatMap {
    case (user,products) => products.map(p=>(user,p))
}
//out:
//List(
//   ("user_001","prod_A"), ("user_001","prod_B"),
//   ("user_002","prod_C"),
//   ("user_003","prod_A"), ("user_003","prod_D"), ("user_003","prod_E")
// )