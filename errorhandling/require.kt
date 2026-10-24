fun main(){
    try{
    setAge(-1)
    }catch(e:IllegalArgumentException){
        println(e)
    }

}

fun setAge(age:Int){
    require(age >= 0) {"age can't be negtive"}
}