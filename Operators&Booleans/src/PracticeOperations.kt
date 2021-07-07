fun main(args: Array<String>){
//    First Exercise
//    var a = 76.254;
//    var b = 3.867;
//
//    println("Addition of a & b: ${a + b}");
//    println("Subtraction of a & b: ${a - b} ");
//    println("a multiplied by b: ${ a * b}");
//    println("a divided by b: ${ a/b}");
//    println("The remainder of a and b is ${a%b}");

//    __Second Exercise
//    val kiloMeat = 29.99;
//    val purchaseAmount = 1F/3 //The F turns the 1 into float because otherwise you'll have a zero;
//    println("The total cost of the meat is ${kiloMeat * purchaseAmount}");

//    __Third Exercise
    println("Please enter the amount that you have in your bank amount:");
    val bankAmount = readLine()?:""
    val amount = bankAmount.toDouble()
    println("Your bank account has tripled to ${amount * 3}")


}