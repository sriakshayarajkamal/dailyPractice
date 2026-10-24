fun main(){
    println("For loop basics")
    println()
    println("printing from 1 to 5 using \"range\"") //closed ended range
    for(i in 1..5){
        println(i)
    }
    println("printing from 1 to 5 uing \"range and symbol\"")
    for(i in 1..<6){
        println(i)
    }
    println("printing from 1 to 5 using \"until\"") 
    for(i in 1 until 5){
        println(i)
    }
    println("printing from 1 to 10 but using \"step of 2\"")
    for(i in 1 until 10 step 2){
        println(i)
    }
    println("prtinting from 10 to 1 using \"downTo\"")
    for(i in 10 downTo 1 step 2){
        println(i)
    }
    println("printing character in a string")
    for(i in "Akshayay"){
        println(i)
    }
    println("while loop")
    var whileI = 1;
    while(whileI <= 5){
        println(whileI)
        whileI++;
    }
    println("do While loop")
    var doWhile = 1
    do{
        println(doWhile)
        doWhile++
    }while(doWhile < 0)
    fun doSomething(name: String, action: () -> Unit) {
        println(name)
        action()
    }
    doSomething("Akshayay"){println("hello")}

}