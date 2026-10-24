class Calculator {
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun add(a: Int, b: Int, c: Int): Int {   // different number of params
        return a + b + c
    }

    fun add(a: Double, b: Double): Double {   // different param types
        return a + b
    }
}
class Printer{
    fun display(name:String){
        println(name)
    }
    fun display(age:Int){
        println(age)
    }
    fun display(name:String, age:Int){
        println("$name $age")
    }
}

fun main() {
    val calc = Calculator()
    println(calc.add(2, 3))          // 5    → first add
    println(calc.add(2, 3, 4))       // 9    → second add
    println(calc.add(2.5, 3.5))      // 6.0  → third add
    val dis = Printer()
    dis.display("akshaya")
    dis.display(4)
    dis.display("aksahaya",5)
}
