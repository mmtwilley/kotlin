fun main(args: Array<String>){
    var title: String? = "The Life of Pi"
    println(title?.substring(3,6))

    var num: Double? = 6.34
    var c = num?.times(6)
    println(c?.toFloat())

    var userName = readLine()?:""
    println(userName?.length)
}