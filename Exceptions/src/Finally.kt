import java.lang.Exception

// A finally block will be executed whether or not an exception occurs



fun main(args: Array<String>){
        var test = readLine();

        try {
            println(test?.toInt())
        } catch(e: Exception){
            println("An exception has occurred! \n ${e.localizedMessage}");
            e.printStackTrace();
            // We can also print the stacktrace
            // This is usually a good idea, as it will likely go inside a log
        } finally{
            println("The execution has completed")
        }
}
