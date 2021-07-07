fun main(args:Array<String>){
    println("Please enter a number:")
    val userNum = readLine()?:"";


    try{
        val number = userNum?.toInt();
        println("$userNum multiplied by 5 is ${number* 5}!");
    } catch(e:Exception){
        println("this doesn't work.")
        e.printStackTrace()
    }

}