package inheritance
open class Animal(val name:String){
    open fun sound(){
        println("${name} makes a sound")
    }
}
class Dog(name:String) : Animal(name){
    override fun sound(){
        println("${name} barks")
    } 
}
class Cat(name:String):Animal(name){
    override fun sound(){
        println("${name} meows")
    }
}
fun main(){
    val dog = Dog("citty")
    val cat = Cat("micky")
    dog.sound();
    cat.sound();
}