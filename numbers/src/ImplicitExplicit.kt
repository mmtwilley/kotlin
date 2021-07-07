fun main (args: Array<String>){
    val cats = 3 //Implict
    println(cats::class.java)

    //Explict
    val dogs:Byte = 5
    println(dogs::class.java)

    val days:Short = 2000
    println(days::class.java)

    val meals:Int = 3
    println(meals::class.java)

    val money = 5.99
    println(money ::class.java)

    val life  = 42
    println(life :: class.java)

    val newLife = 54L
    println(newLife :: class.java)

    val moreMoney = 6.69F
    println(moreMoney :: class.java)

}