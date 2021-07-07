// ?: Guarantees a result returned
//Either the returned result for a non-null variable, or a default
//After an elvis operator, there's no need for null safety because the
//elvis has a value
fun main(args: Array<String>){
  val catName: String? = null
    println(catName?:"This cat has no name")
    println(catName?:"Maddie".length)
}