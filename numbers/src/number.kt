/**
 * Numbers in Kotlin are the same as numbers in math
 * Numbers can be assigned to variables
 * We can perform operations on numbers and variable
 **/
/**
 *  different types of numbers are stored in memory in different ways
 *  Number types has limits
 *  Byte, short, int, long - whole numbers
 *  Float & Double are decimals
 *  The most common are Int & Double
 */

/**
 * var items = 5 Int
 * var nbOfPeople = 7500000000 Long
 * var price 29.99 =Double
 * var pi = 3.1415926535 Also a double
 */

fun main(args: Array<String>){
    var price = 34
    var items = 3
    var total_price = price * items

    println("Total price is $$total_price")


    var nbOfPeople = 7500000000
    var pi = 3.1415926535

    println(items ::class.java)
    println(nbOfPeople :: class.java)
    println(pi ::class.java)

}