open class Animal{
    fun display(){
        println("This is animal class")
    }
}

class Dog : Animal(){
   
    fun sound():String{
        return "Bark"
        
    }
}
fun main(){
    var d = Dog()
    d.display()
    println(d.sound())
}