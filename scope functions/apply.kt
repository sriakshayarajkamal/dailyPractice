fun main(){
    println("Apply scope function")
    val p = Person().apply{
        name="akshaya"
        age=34
    }
    println(p.age)
    println()
    println("the important thing is apply don't return lambda")
    var p1 = Person().apply{
        name="akshaya"
        //56 -> if i give like let and run , but in apply it shows warning, it does not return lambda
        age = 46
    }
    //println(p1)-> if i give like this , it prints its memory
    println(p1.age)

    println()
    println("with lambda result and printing")
    val p2 = Person().apply {
        name = "Akshaya"
        name.length//it does not print 7, lamda simply ignores
    }

    println(p2.name)
}


class Person(var name:String="", var age:Int=0){

}