fun main(args: Array<String>){
//    println("Enter a number")
//    val userNum = readLine()?:"";
//
//    val byteUserNum = userNum.toByte();
//    val shortUserNum = userNum.toShort();
//    val intUserNum = userNum.toInt();
//    val longUserNum = userNum.toLong();
//    val floatUserNum = userNum.toFloat();
//    val doubleUserNum = userNum.toDouble();
//
//
//
//    println("userNum was a ${userNum::class.java}")
//    println("byteUserNum is now a ${byteUserNum::class.java}");
//    println("shortUserNum is now a ${shortUserNum::class.java}");
//    println("intUserNum is now a ${intUserNum::class.java}");
//    println("longUserNum is now a ${longUserNum::class.java}");
//    println("floatUserNum is now a ${floatUserNum::class.java}");
//    println("doubleUserNum is now a ${doubleUserNum::class.java}");

    val pi = 4.14159;
    val floatPi = pi.toFloat();
    val intPi = pi.toInt();
    val stringPi = pi.toString();

    println(pi)
    println("pi is a ${pi::class.java}")
    println("intPi has a value of $floatPi and is a ${floatPi::class.java}")
    println("floatPi has a value of $intPi and is a ${intPi::class.java}")
    println("floatPi has a value of $stringPi and is a ${stringPi::class.java}")
}