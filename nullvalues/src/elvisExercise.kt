fun main(args: Array<String>){
    val price :Double= 29.99
    println("How many items do you want?")
    val quantity = readLine()
    val purchasedProducts = quantity?.toInt()?:1
    println("Your total would be ${purchasedProducts * price}")

}