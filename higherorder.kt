fun main(){
    higherOrder(2,3,::add)
    println(square(2,::calc))
    //lambda function
    var answer = square(2, {a:Int -> a*a})
    println(answer)

}
fun add(n1:Int, n2:Int):Int{
    return n1+n2
}
fun higherOrder(n1:Int, n2:Int , fn:(Int,Int) -> Int){
    println(fn(n1,n2))
}
fun calc(n1:Int):Int{
    return n1*n1
}
fun square(n1:Int, fub:(Int)->Int):Int{
    return fub(n1)
}
//higherorder function practise on squaring 

