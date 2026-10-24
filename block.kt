fun main(){
    val outer = 10
    if(true){
        val inner = 20
        println(outer)
        println(inner)
    }
    println(outer)
    //println(inner) //wont work it is in inner scope
}