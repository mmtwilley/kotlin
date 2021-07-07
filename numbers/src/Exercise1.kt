fun main (args: Array<String>){
    println("Enter a number")
    var userInput = readLine()?:""   // Asking the user for a number and guarding against a null value
    var num = userInput.toInt()
    var d1 = 43.23
    var newNum = num * d1//Mulitiplying by a double so a double will return
    println("You entered $userInput which multiplied by 4.25 returns $newNum, which is a ${newNum :: class.java}")

}