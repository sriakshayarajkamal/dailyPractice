fun main(){
    println("Basic using let")
    println()
    var name:String = "Akshaya"
    name.let{
        println(" hi $it")
    }
    println()
    println("Using let printing name,length,touppercase")
    name.let{
        println(it)
        println(it.length)
        println(it.uppercase())
    }
    println()
    println("printing squares and store it in a variable")
    val res =  6.let{
        it*it
    }
    println(res)

    println()
    println("nulable usage")
    var age:Int? = 6
    age?.let{
        println(it)
    }

    println()
    println("without creating object for class")
    person("Akshaya",56).let{
        println(it.name)
        println(it.age)
    }

    println()
    println("performing operations")
    val marks = listOf(80, 90, 95, 88)
    marks.let{
        var avg = 0
        for(i in it){
            avg += i
        }
        avg = avg / it.size
        println(avg)
    }
    marks.let{
        var highest = 0
        for(i in it){
            if(highest < i){
                highest = i
            }
        }
        println(highest)
    }
}

class person(var name:String, var age:Int){

}