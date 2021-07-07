fun main(args: Array<String>){
    val household = 3
    val animals = 3
    val animalsProducer = 1

    val fundGiven = ((animals <= 5) && (animalsProducer > 0)) || (household >= 3)
    println("Will the family receive the fund? $fundGiven")
}