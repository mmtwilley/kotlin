fun main(args: Array<String>) {
    println("Enter your birth year")
    var year = readLine()?:""
    println("Your about ${2020 - year.toInt()}")
}