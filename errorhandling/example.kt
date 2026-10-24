fun main(){
    var a:Array<Int> = arrayOf(1,2,3)
    try{
        var res = a[4]
    }catch(e:Exception){
        println(e)
    }
    println("end")


}