fun main(args: Array<String>){
    var userNum = readLine()
    var num = userNum?.toDouble()?.times(7)
    println("Length of $userNum is ${num?.toString()?.length}")


}