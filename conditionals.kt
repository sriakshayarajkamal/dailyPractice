fun main(){
    println("IF-ELSE")
    val age = 18
    if(age > 20){
        println("can vote")
    }else{
        println("can't vote")
    }
    println()
    println("IF/ELSE IF/ELSE")
    val marks = 75
    if(marks >= 90){
        println("A")
    }else if(marks >= 80){
        println("B")
    }else if(marks >= 70){
        println("C")
    }else{
        println("Fail")
    }

    println()
    println("IF as an expression")

    var msg : String? = null
    msg = if (89 < 90) "Smaller" else "Larger"
    println(msg)

    println()
    println("When - replaces switch in java")

    val day = 3
    when(day){
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        else -> println("Weekend")
    }

    println()
    println("When with mulitple values in one branch")

    val daycount = 2
    when (daycount){
        1,2,3,4,5 -> println("Work")
        6,7 -> println("Holiday")
        else -> print("Ivalid")
    }

    println()
    println("when as expression")

    val markExp = 85
    val gradeExp = when {
        markExp >= 90 -> "A"
        markExp >= 80 -> "b"
        else -> "Fail"
    }
    println(gradeExp)

    println()
    println("When with ranges")

    when(marks){
        in 90..100 -> println("A")
        in 80..89 -> println("B")
        else -> println("Fail")
    }

    println()
    println("realtional operatos in when")
    val check = 10
    when{
        check > 20 -> println("$check is greater")
        check < 20 -> println("$check is samller")
    }

    println()
    println("Again the example for when as expression")
    var x = 10
    var text = when(x){
        10 -> "yes it is 10"
        20 -> "yes it is 20"
        else -> "not 10 or 20"
    }
    println(text)

    //while using "when as expression" you much write all the possible cases or ends with else
    //example var text = when(x) { 20-> "yes it is 20"}
    //but here it is 10 right, 10 != 20 so it won't go that line and it ckecks for "true statent" or "else" if nothing there
    //it has a cofusion of what to print, so it shows error
    println()
    println("Another example for when ")
    var whenVar  = 15
    var validNumber = 11..20
    when(whenVar){
        in 1..10 -> println("within range of 10")
        in validNumber -> println("range of 11 to 20")
        !in 10..20 -> println("not in 10 to 20")
        else -> println("None of the above")
    }
}