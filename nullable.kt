fun main(){
    var name : String? = "Akshaya"
    name = null
    println(name)

    val findLength : String? = "Sri"
    var len = findLength?.length
    println(len)

    //elvis operator
    var ex:String? = undefined
    var result = ex ?: "Unknown"
    println(result)

    var ex2:String? = "Sri"
    var reult2 = ex1?;"unknown"
    println(result)
}