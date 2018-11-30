fun main(args: Array<String>){
    val name = "Sam"
    val str = "Hello $name"

    println("The statement is $str.  The number of characters in the statement is ${str.length}.")
    println()

    var a = 10
    val b = 5
    println("The sum of $a and $b is ${a + b}.")
    println()

    var rect = Rectangle()
    rect.length = 5
    rect.width = 3

    println("The length of a rectangle is ${rect.length} and width is ${rect.width}.  " +
            "The area is ${rect.length * rect.width}.")
    println()

    println("Printing 1..5 range.") //Contains 1, 2, 3, 4, 5.
    for (i in 1..5){
        print(i)
        if (i < 5) {
            print(", ")
        }
    }
    println()
    println()

    println("Printing range, 5 downTo 1.") //Contains 5, 4, 3, 2, 1
    for (j in 5 downTo 1) {
        print(j)
        if (j > 1) {
            print(", ")
        }
    }
    println()
    println()

    println("Printing 5 downTo 1 step 2.") // Contains 5, 3, 1
    for (k in 5 downTo 1 step 2){
        print(k)
        if (k > 1) {
            print(", ")
        }
    }
    println()
    println()

    println("Printing 'in 'a'..'z''.") // Contains entire alphabet
    for (l in 'a'..'z'){
        print(l)
        if (l != 'z') {
            print(", ")
        }

    }
    println()
    println()

    val r4 = 'a'..'z'

    var isPresent = 'c' in r4 //Checks to see if 'c' is in range r4
    println("The condition for 'C' being present in the alphabetic range is $isPresent.")
    println()


    var countDown = 10.downTo(1)  //Contains 10, 9, 8, ... 1
    for (m in countDown) {
        print(m)
        if (m > 1) {
            print(", ")
        }
    }
    println()
    println()

    var moveUp = 1.rangeTo(10) // Contains 1, 2, 3, 4...10
    for (n in moveUp) {
        print(n)
        if (n < 10) {
            print(", ")
        }
    }
    println()
    println()

    val c = 2
    val d = 5
    var maxValue: Int = if (c > d) {
                            println("C is greater.")
                            c
                        }else {
                            println("D is greater")
                            d

    }
    println("The current variable $maxValue is greater than $c.")
    println()
    println()

    val x = 21

    when (x) {
        0, 1 -> println("X is 0 or 1")
        2 -> {
            println("X is 2")
            println("Deal with it.")
        }
        in 3..20 -> println("X is between 3 and 20.")
        !in 3..20 -> println("X is not between 3 and 20.")
        else -> println("X value is unknown.")
    }

    val y = 10
    var str2:String = when (y) {
                            1 -> "Y is 1"
                            2 -> "Y is 2"
                            else ->{
                                "Y is unknown." // This will not be printed.
                                "Y is an alien." // Only the last line of code block will be printed.
                            }
    }
    println(str2)
    println()


    // Iterator examples for printing "Hello" four times.
    println("For loop.")
    for (p in 1..4){
        println("Hello.")
    }
    println()
    println()

    println("While loop.")
    var p = 3
    while (p < 5){
        println("Hello = $p.")
        p++
    }
    println()
    println()

    println("Do...while.")
    var q = 2
    do {
        println("Hello = $q.")
        q++
    } while (q < 5)
    println()
    println()

// Loops, cont.
    for (i in 1..10)


}


class Rectangle {

    var length: Int = 0
    var width: Int = 0
}