fun main(){
    println("Start your function name with main only, its the entry point, the function starts and JVM specifically looks for main only")
    greeting("Akshaya")
    //positional arguments does not matter here
    createProfile(name="Akshaya",age=21,clg="KPRIET")
    //positional arguments matters
    createProfile("Aksahya",21,"KPR")
    //mixing allowed, but positional arguments comes first
    //createProfile(name="Akshaya",21,"KPRioet") ----> Error
    println()
    println("Single expression function")
    //single expression function'
    println(add(3,4))
    println()
    println("Lambda function")
    val multiply = {a:Int,b:Int -> a*b}
    println(multiply(2,3))
    println()
    println("lambda function using "it")
    val doub = (Int) -> Int = {it*2}
}

//default function parameter
fun greeting(name:String,msg:String="hi"){
    println("$msg, $name")
}
fun createProfile(name:String, age:Int, clg:String){
    println("Hi I am $name, age is $age, clg name was $clg")
}
//default parameters must come after required parameters

//single expresion function
fun add(n1:Int, n2:Int) = n1+n2