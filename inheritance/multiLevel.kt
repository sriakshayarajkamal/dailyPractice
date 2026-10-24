fun main(){
    val dog = Dog("Micky")
    dog.bark()
    val electricCar = ElectricalCar("EV")
    electricCar.chargeBattery()
}
open class Animal(val name:String){
    open fun breathe(){
        println("${name} is breathing")
    }
}
open class Mammal(name:String) : Animal(name){
    open fun feedFood(){
        println("${name} feeds food to its kid")
    }
}
class Dog(name:String):Mammal(name){
    fun bark(){
        feedFood()
        breathe()
        println("${name} is barking")
    }
}
open class Vehicle(val name:String) {
    open fun start(){
        println("${name} is starting")
    }
    open fun stop(){
        println("${name} is stopping")
    }
}
open class Car(name:String) : Vehicle(name){
    open fun openTrunk(){
        println("opening")
    }
}
class ElectricalCar(name:String) : Car(name){
    fun chargeBattery(){
        println("charger vehicle")
        start()
        stop()
        openTrunk()
    }
}