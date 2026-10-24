fun setAge(age: Int) {
    if (age < 0) {
        throw IllegalArgumentException("Invalid age")
        println("this never runs")   // ← never reached
    }
    println("Age set to $age")   // ← also never reached if throw happened
}
fun check(age: Int) {
    //if (age < 0) return          // stops here, returns nothing
    if (age < 0) throw Exception("Cant be neative") // stops here, returns an error
    println("runs only if above didn't trigger")
}

fun main(){
    try{
    setAge(-3)
    check(-1)
    }
    catch(e:Exception){
        println(e)
    }
}