fun main (args: Array<String>){
    println("Enter a Number")

    val input = readLine()?:"";
    val numInput = input.toDouble();

    var pi = 4.14159;

    var result = numInput * pi;

    println("The result is $result. The type of the result is ${result::class.java}")




}