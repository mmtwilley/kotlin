fun main(args: Array<String>){
   // println("Input a message")
    //val greetings = readLine()
    //println(greetings?:"This is the default message")

    println("Input a number")
    val input = readLine()
    val number = input?.toInt()
    println("$number multiplied by 5 is ${number!! * 5}")

}