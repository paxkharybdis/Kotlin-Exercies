fun main(args: Array<String>){
    val name = "Sam"
    val str = "Hello $name"

    println("The statement is $str.  The number of characters in the statement is ${str.length}.")

    val a = 10
    val b = 5
    println("The sum of $a and $b is ${a + b}")


    var rect = Rectangle()
    rect.length = 5
    rect.width = 3

    println("The length of a rectangle is ${rect.length} and width is ${rect.width}.  " +
            "The area is ${rect.length * rect.width}.")

    val r1 = 1..5 //Contains 1, 2, 3, 4, 5.

    val r2 = 5 downTo 1 //Contains 5, 4, 3, 2, 1

    val r3 = 5 downTo 1 step 2 // Contains 5, 3, 1

    var r4 = 'a'..'z'  // Contains entire alphabet

    var isPresent = 'c' in r4 //Checks to see if 'c' is in range r4

    var countDown = 10.downTo(1) //Contains 10, 9, 8, ... 1

    var moveUp = 1.rangeTo(10) // Contains 1, 2, 3, 4...10
}

class Rectangle {

    var length: Int = 0
    var width: Int = 0
}