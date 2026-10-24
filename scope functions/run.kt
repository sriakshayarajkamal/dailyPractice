fun main(){
    println("Run scope function")
    var name = "Akshaya"
    var result = name.run{
        this 
    }
    println(result)
    println("major diff between apply and run")
    var person = Person().run{
        name = "Kayal"
        name //here lambda returns defaults
        // name is an expression that evaluates to a String ("Akshaya" or "Kayal"), whereas name = "Akshaya" is an assignment expression, and assignments in Kotlin evaluate to Unit.
    }
    println(person)
    println()
    println("comparing with let and run")
    var age = 8.run{
        this+2
    }
    println(age)
    println()
    println("rrun executes the lambda, returns the lambda result.")
}
class Person(var name:String = "Akshaya"){
    fun display():String{
    return name}
}
