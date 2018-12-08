package com.mykotlin

fun main(args: Array<String>) {

    var student = Student("Nathan", 10)  // "Nathan calls String in primary constructor
    // 10 calls INT in secondary constructor
    print(student.id)
    println()

    //Inheritance
    var dog = Dog("Black", "Pug")
    dog.breed = "labrador"
    dog.color = "black"
    dog.bark()
    dog.eat()

    var cat = Cat()
    cat.age = 10
    cat.color = "Black"
    cat.eat()
    cat.meow()
}

class Student(var name: String) { // Primary constructor

    var id: Int = -1

    init {
        println("Student has the name $name, and ID is $id.")  // $id is still defined as -1, not 10.
    }

    // Secondary Constructor
    constructor(n: String, id: Int) : this(n) {
        // The body of the secondary constructor is called after the init block
        this.id = id
    }
}
// Inheritance
/**
open class Animal {
    var color: String = ""

    fun eat(){
        println("Animal Eating")
    }
}

class Dog: Animal() {
    var breed: String = ""

    fun bark(){
        println("Bark")
    }
}

class Cat: Animal() {
    var age: Int = 7

    fun meow() {
        println("Bark")
    }
}
*/
// Primary and secondary constructors with inheritance.
 open class Animal(var color: String) {

}

class Dog(color: String, var breed: String): Animal(color){

}