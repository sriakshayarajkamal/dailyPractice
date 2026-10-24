fun main(){
var name = "Akshaya"

var result = name.also {
    println("Name is: $it")   // side effect
}
println()
println("side effects")
val numbers = mutableListOf(3, 1, 4)
    .also { println("Before sort: $it") }  // side effect — just logging, doesn't change list
    .apply { sort() }                       // main job — sorting the list
    .also { println("After sort: $it") }   // side effect — just logging again


println()
println("using apply,it also wont return")
var result2 = name.apply{
    name = "Sri"
}
println(result2)  
println()
println("using also, it also wont return")
var result3 = name.let{
    name="jana"
    println(name)
    

}
println(result3)
println()
var s = sample("viji")
var some  = s.let{
    it.name="raj"
    it.name
    println(name)
}
println(some)

}
class sample(var name:String){

}