/**
 * Input is read as a String
 * Can be converted into numbers
 * readline command can return nothing(null)
 */
fun main(args: Array<String>) {
    println("Input a number")
//    ?:"" is a guard against empty returns
    val userinput = readLine()?:""
    val userNumber = userinput.toInt()
    println("You wrote: ${userinput.toInt()}")
}