
fun main(args: Array<String>) {
//    Returns a length of a string
//    Length is a property of a string
    val myPet = "Crocodile"
    println(myPet.length)

//    Capitalize - need the parentheses
    val myName = "mark"
    println(myName.capitalize())

//   Decapitalize
    val animal = "Panda"
    println(animal.decapitalize())

//    Trim - remove spaces at the beginning and the end of the text
    val myText = "  There are too   many spaces  "
    println(myText.trim())

//    Get a character -position always start at zero
    println(myPet.get(0))
    println(animal[3])

// Get part of string
    println(animal.substring(1))
    println(myPet.substring(3,6))
}