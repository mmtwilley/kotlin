import java.lang.IllegalStateException

// Throw - a way to generate your own exceptions
// Can be used if you detect a state in your program that you cannot recover from
// Using the keyword throw

fun main(arg: Array<String>){
    var test = readLine();
    throw IllegalStateException("I don't like this input.")

}