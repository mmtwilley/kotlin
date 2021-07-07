fun main (args: Array<String>){
    var bikes = 5;
    bikes + 1;
    //    The new value will not be assigned to bikes so the value with remain 5
    println(bikes);
    bikes += 3;
    println("Plus 3: $bikes")

    bikes -=4
    println("Subtracting 4: $bikes")

    bikes *= 2
    println("Multiplied by 2: $bikes")

    bikes /=2
    println("Divided by 2: $bikes")

    bikes = 5
    bikes %= 2
    println("Modulus of 5/2: $bikes")

}