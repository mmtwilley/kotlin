fun main(args: Array<String>){
    println("Enter the amount of money you have have:")
    var money = readLine()?:""
    var principal = money.toDouble()
    var amountAfter5Years = principal * 1.055 * 1.055 * 1.055 * 1.055 * 1.055
    println("After 5 years with an interest of 5.5, you will have $amountAfter5Years")

}