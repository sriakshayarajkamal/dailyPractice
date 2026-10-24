fun main(){
    println("listOf examples and its usage")
    val fruits = listOf("apple","banana","mango")
    println(fruits)
    println(fruits.size)
    println(fruits[0])
    println(fruits.first())
    println(fruits.last())
    println(fruits.contains("apple"))
    println()
    println("mutableListOf examplese and operations")


    val vegetables = mutableListOf("apple","orange","mango","banana")
    //it works even its val
    println(vegetables.size)
    println(vegetables.first())
    println(vegetables.last())
    println(vegetables[2])
    println(vegetables.remove("apple"))
    println(vegetables.add("jackfruit"))
    println(vegetables)

    println()
    println("Sets example without mutable")
    val nums = setOf(1,2,3)
    println(nums.size)
    println(nums.contains(3))
    println(nums.elementAt(2))

    println()
    println("Sets example with mutable")
    var mutableNums = mutableSetOf(1,2,3,4)
    println(mutableNums.add(4))
    println(mutableNums.add(5))
    println(mutableNums.remove(2))
    println(mutableNums.contains(3))
    println(mutableNums)

    println()
    println("Maps example without mutable")
    val scores = mapOf("Akshaya" to 95,"Ram" to 99,"Praveen" to 92)
    println(scores)
    println(scores.size)
    println(scores["Akshaya"])
    println(scores.keys)
    println(scores.values)
    println(scores.contains("Ram"))
    println("map returns nullable")
    println(scores["unknown"])
    println(scores.getOrDefault("Unknow",0))
    println(scores.getOrElse("Un"){-1})

    println("Map with mutable example")
    var scoresMut = mutableMapOf("Akshaya" to 65, "John" to 88, "Sri" to 99)
    //update
    scoresMut["Akshaya"] = 56
    scoresMut["Dev"] = 88 //adding
    //scoresMut.remove("Sri")
    println(scoresMut)

    println()
    println("iterating over map")
    

}