fun main(){
    println("Example of functions with scope function and innitializing objects")
    var s = Student().apply{
        name="Aksahya"
        age = 20
        grade = "O"
        display()
    }
    println()
    println("Example for primary constructor")
    var s1 = studentPrimary("Akshaya",21,"0")
    s1.display()
    println()
    println("Exmaple for secondary constructor wiht init")
    var s2 = studentPrimary("Akshayay")

}
class Student(){
    var name:String=""
    var age:Int=0
    var grade:String=""
    fun display(){
        println("Hi, I am ${name}, age ${age}, grade ${grade}")
    }
}
class studentPrimary(var name:String, var age:Int, var grade:String){
    init{
        println("Print first this")
    }
    constructor(name:String) : this (name,0,"0"){
        println("Hi, I am ${name}, age ${age}, grade ${grade}")
    }
    fun display(){
        println("Hi, I am ${name}, age ${age}, grade ${grade}")
    }
}