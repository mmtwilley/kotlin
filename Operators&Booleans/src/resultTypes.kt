// The type of the result of an operation is the same as the type of the largest operand and in terms of size in memory
//Byte < short < int < long < float < Double
fun main(args: Array<String>){
    val a : Short = 6
    val b : Int = 32
    val r = a * b
// R should be an int
    println("R is a ${r::class.java}")

    val c: Long = 8314622
    val d = 12.44F
    val r2 = c/d

    println("R 2 is a ${r2::class.java}")

    val e: Float = 19F
    val f: Double = 54.32423423
    val r3 = e/f
    println("r3 is ${r3::class.java}")
}