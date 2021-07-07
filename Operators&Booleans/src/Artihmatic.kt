fun main(ags: Array<String>){
//    Addition
    println(5+2)
    println("Hi" + " John")

//    Subtraction
    println(5-2)
//    Multiplication
    println(4*2)

//    Division
    println(5/2)
//    the result is going to be an interger
    println(5/2f)
//    this would give you a float

//    Modulus
    println(7%5)

//    Increment
    var num = 2
    println("This is num before using the increment,$num")
    num++
    println("With the increment, the num is now $num ")
    num --
    println("The decrement now turn the num to $num")
//  You can't use the increment in express in a println statement , it would result in the num being the same
    var cats = 1
    println("I have ${cats++} cats") // This would result in one cat
//    IT would print before the expression is evaluated
//    To use the increment or decrement with an expression in sentence
    println("I now have ${++cats} cats.") // This results in 3 cats because of the of expression from the previous sentence

}