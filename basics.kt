fun main() {

    //declare variable before using and assing a value, if u didn't assign any values it shows error
    //another option is , "if u mention the data types for the particular variable, u have a chance to reassign it" see line 3
    
    var clg : String 
    clg = "KPR"
    val name = "Akshaya"
    var age = 20

    println("Name: $name")
    println("Age: $age")
    println("clg: $clg")

    age = 21  // works fine
    println("Next year: $age")

    // val name = "Someone" // this would give an error
}
