fun main(){
    println("Lambda function")
    var result = {a:Int -> a%2 == 0}
    println(result(4))
    println()
    println("Lambda function with one parameter")
    val res : (Int) -> Int = {it*it}
    println(res(3))
    println()
    println("Lambda function with one parameter")
    var shout = {it:String -> it.uppercase()}
    println(shout("Akshaya"))
    println("returns length")
    var len : (String) -> Int = {it.length}
    println(len("Sri"))
    println("lambda taking two string and joining with a sapce")
    var joining = {st1:String, st2:String -> "$st1 $st2"}
    println(joining("sri","Akshay"))
    println("using 'it' takes an int, returns true if n> 10")
    var ot:(Int) -> Boolean = {it>10}
    println(ot(3))
}