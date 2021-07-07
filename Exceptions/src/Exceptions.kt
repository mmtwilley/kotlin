import java.lang.Exception

// An exception is an unexpected event in a program
// The system cannot recover from an expect

//EXceptions have a message
// Stacktrace - a log of what the program did before it reached this point
//Optionally a cause

fun main(args: Array<String>){
    var test = readLine();
    try {
        println(test?.toInt())
    } catch(e: Exception){
        println("An exception has occurred! \n ${e.localizedMessage}");
        e.printStackTrace();
        // We can also print the stacktrace
        // This is usually a good idea, as it will likely go inside a log

    }
}

// Try-catch blocks are a way to manage exceptions
// If an exception occurs, the code in the catch so the code can continue