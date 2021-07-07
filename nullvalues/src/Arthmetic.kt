//We cannot use the classic operators for null variables
// Instead we use replacement Operators

fun main(array: Array<String>){
    val a: Int? = 10;
    println(a?.plus(3))
    println(a?.minus(3))
    println(a?.times(3))
    println(a?.div(3))
    println(a?.rem(3))

}