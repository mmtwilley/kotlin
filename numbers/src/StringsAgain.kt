/**
 * Every variable in Kotlin has a type
 * Kotlin automatically decides a type
 *
 * ANY VARIABLE CAN BE CONVERTED INTO A STRING
 */



fun main(args: Array<String>){

    // Like numbers you can explicit declare variables as strings
    val name = "John"
    val newName:String = "Alice"

    val cats = 3
    val catsSentence = "Have a $cats cats"
    println("The data type for cats is ${cats::class.java}")
    val catsStrings = cats.toString()
    println("The data type for catsString is ${catsStrings::class.java}")
    println("The data type for catsSentence ${catsSentence::class.java}")

    val pi = 3.1415
    println("The data type for pi is ${pi::class.java}")
    val piString = pi.toString()
    println("The data type for piString is ${piString::class.java}")
}


