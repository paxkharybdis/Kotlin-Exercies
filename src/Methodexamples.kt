fun main(args: Array<String>){
    // Pass values to the add(), calculate and print there.
    add(2, 4)

    // Pass values to add2(), print here, calculate there.
    var sum = add2(2, 4)
    println("Sum of c and d is " + sum)

    // Detect which number is greater.
    var maxValue = max(5,6)
    println("The greater number is $maxValue.")

    var max2Value = max2(7, 8)
    println("The greater number is $max2Value.")

    var student = Student()
    println("Pass status: " + student.hasPassed(57))

    println("Scholarship Status: " + student.isScholar(76))

    // Adding strings by calling function/method.
    val str1:String = "Hello "
    val str2:String = "World"
    var str3:String = "Hey "
    println(str3.add(str1, str2))

    val x: Int = 6
    val y: Int = 10

    val greaterVal = x.greaterValue(y)
    println("$greaterVal is the larger number.")

    val biggerVal = x biggerValue y
    println("Infix example: $biggerVal is the larger number.")

}

//Specify value types used.  No return type specified.
fun add(a: Int, b: Int) {
    println("Sum of a and b is ${a + b}")
}

fun add2(c: Int, d: Int): Int{ //Specify Int return type.
    return c + d
}

//Functions as expressions.
/**
 * The 'max' function concatenates a multi-line
 * function into one line.
 */
fun max(e: Int, f: Int): Int = if (e > f) e else f

/**
 * This function is still an expression, even though
 * it is multi-line, as it uses '=' instead of {} to
 * achieve the logic.
 */
fun max2(g: Int, h: Int): Int
    = if (g > h) {
    //print("$g is greater.")
    g
} else {
    //print("$h is greater.")
    h //Whatever is the last line in the block is returned.
}

// Extension functions


class Student {
        fun hasPassed(grades: Int): Boolean {
            return grades > 40 // Concatenated if/else statement.
        }
}

// fun Classname.newFunction syntax to make this
// function a part of the Student class.
fun Student.isScholar(grades:Int): Boolean{
    return grades > 95
}

// Add strings together
fun String.add(s1: String, s2:String): String {
    return this + s1 + s2
}

// Another example of finding greater value.
fun Int.greaterValue(other: Int): Int {
    return if (this > other)
        this
    else
        other
}

// Infix Functions
// INFIX functions have only ONE parameter

infix fun Int.biggerValue(other: Int): Int {
    return if (this > other)
        this
    else
        other
}


