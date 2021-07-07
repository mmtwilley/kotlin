/**
 * A variable of a certain type can be converted into a
 * different type
 *
 * The variable itself does not get converted
 * The result of the operation can be assigned to a new variable
 **/

/**
 * if you convert to a smaller type, some information might be lost or corrupted
 */



fun main(args: Array<String>){
    val cats = 3
    val longCats = cats.toLong()
    println("I have $cats cats")
    println(cats::class.java)
    println(longCats::class.java)
    println(longCats)

//    If you convert to a smaller type, some information might be lost or corrupted
    val people = 7500000000
    val fewPeople = people.toInt()
    println("This is the output of people & fewPeople")
    println(people::class.java)
    println(fewPeople::class.java)
    println("The result of converting fewPeople into Int resulted in $fewPeople")

    val dogs = 5
    val byteDogs = dogs.toByte()
    val floatDogs = dogs.toFloat()

    val ferrets = 6;
    val doubleFerrets = ferrets.toDouble();
    val shortFerrets = ferrets.toShort();

    println("doubleFerrets is a ${doubleFerrets::class.java}")
    print("shortFerrets is a ${shortFerrets::class.java}")


    println("This is the dogs examples")
    println(byteDogs::class.java)
    println(floatDogs::class.java)
}