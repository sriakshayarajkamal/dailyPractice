const val PI = 3.14

fun main(){
    //variable = value (if not error) || to avoid error put Data Type (line 10)

    //1.var -> can reassign

    var name= "Akshaya"
    println("Name: ${name}")

    //2.val -> cannot reassign

    val age : Int
    age = 20;
    println("Age: ${age}")

    //val -> holds a reference, not a compile time constant

    var name1 = "Akshaya"
    val names = name1
    println("Using val printing 'name': ${names}" )

    name1 = "Yuga"
    println(name1) //name1 changes
    println(names) //but names not change

    //const val ->special kind of val
    //its value must be known at compile time
    //const val must be declared outside the function (top level)
    //const val only allow primitive values to store, (int,double,boolean,char,string)

    println("PI value : ${PI}")

    val nameing : String | Int// declared but not assigned
    nameing = 98
println(nameing)

}   