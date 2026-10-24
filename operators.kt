fun main(){
    //arithmetic operators
    val a = 11
    val b = 2

    val adding = a.plus(b)
    val sub = a.minus(b)
    val multiply = a.times(b)
    val divide = a.div(b)
    val modulus = a.rem(b)

    println("Adding: $adding")
    println("Subtraction: $sub")
    println("Multiply: $multiply")
    println("Divide: $divide")
    println("Modulus: $modulus")

    // relational operators
    println("\n-- Relational Operators --")
    println("a > b  : ${a > b}")
    println("a < b  : ${a < b}")
    println("a >= b : ${a >= b}")
    println("a <= b : ${a <= b}")
    println("a == b : ${a == b}")
    //in java === compares the data type and content, here it checks the same memory or not
    println("Dog".compareTo("Dog"))
    println("a != b : ${a != b}")


    //assignment oprator
    println("Assignment operator")

    var Assignexample = 11
    Assignexample += 12
    println("Adding $Assignexample")
    Assignexample -= 11
    println("Subtracting $Assignexample")
    Assignexample *= 2
    println("Multiplying $Assignexample")

    //unary operator
     var unaryEx = 10
     println("symbol using + ${+unaryEx}")
     unaryEx = -unaryEx 
     println("Symbol using - ${unaryEx}")
     var unaryPostAndPre = 40
     unaryPostAndPre++ // use the current value, then increment 
     println(unaryPostAndPre)
     println(unaryPostAndPre++) //the output is 41, not 42(it uses the current value not the updated value)
     println(unaryPostAndPre) //now it prints 42.

     println(--unaryPostAndPre) //it prints the immediate value of 41
     
}
