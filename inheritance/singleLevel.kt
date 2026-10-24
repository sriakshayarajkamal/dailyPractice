fun main(){
    println("Bike is a child for vehicle")
    var b = Bike()
    b.start()
    b.end()
    b.run()
    println()
    println("Car is a child for vehicle")
    var c = Car()
    c.start()
    c.end()
    c.run()
    println()
    println("Example with Animals")
    var dog = Dog("Tommy")
    dog.display()
    dog.eat()
    println()
    println("child has extra properties")
    var st1 = Student("akshaya",26)
    st1.studentDetails()
}
open class Vehicle(){
    fun start(){
        println("vehicle is starting")
    }
    fun end(){
        println("Vehicle is stoped")
    }
    fun run(){
        println("vehicle is moving")
    }
}
class Bike():Vehicle(){
}
class Car():Vehicle(){
}
open class Animal(val name: String) {

    open fun eat() {
        println("$name is eating")
    }
}

class Dog(name: String) : Animal(name) {

    fun display() {
        println("Dog Name: $name")
    }
    override fun eat(){
        super.eat()
        println("${name} is not eating")
    }
}
open class College(var name:String){
    fun display(){
        println("Hi ${name}")
    }
}
class Student(name:String, var age:Int): College(name){
    fun studentDetails() {
        display()
        println("Student Name: $name")
        println("Age: $age")
    }
}


