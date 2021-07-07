fun main (args: Array<String>){
    val num1 = 45;
    println(num1);
    println(num1::class.java)


    val longNum = 232332242323232;
    println(longNum);
    println(longNum::class.java)

    val doubleNum = 23.78
    println(" The variable doubleNum is ${doubleNum::class.java} with a value of $doubleNum.")
}