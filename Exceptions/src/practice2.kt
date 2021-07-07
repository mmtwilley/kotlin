fun main(args: Array<String>){
    println("How many kilometers have you run today?");
    val userMiles = readLine()?:"".toInt();
    try{
        println("SO you run ${userMiles * .62}")
    } catch(e:Exception){
        println("Something funny has happened");
        e.printStackTrace()
    }
}