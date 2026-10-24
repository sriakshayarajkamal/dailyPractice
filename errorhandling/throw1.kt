class InvalidAgeException(message: String) : Exception(message)
fun main(){
        
    try {
        setAge(-5)
        setAge1(-2)              // throw fires inside setAge
        println("never runs")   // ← skipped — throw already fired
    } catch (e: InvalidAgeException) {
        println(e)  // ← execution JUMPS here
    }
    println("continues here") 
}
fun setAge(age:Int){
    if(age<0){
        throw Exception("Age wont negative")
    }
}
fun setAge1(age: Int) {
    if (age < 0) {
        throw InvalidAgeException("invalid")  // stops HERE inside setAge
        println("never runs")                  // ← skipped
    }
    println("never runs either")               // ← skipped
}