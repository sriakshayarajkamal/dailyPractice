fun main(){
    println("without any labels, whenver it meets j==2, just breaks the inner loop.")
    for(i in 1..3){
        for(j in 1..5){
            if (j==2){
                break
            }
            println("i=$i and j=$j")
        }
    }
    println("break the outer loop also when condition meets in inner loop, using labels")
    outer@ for(i in 1..3){
        for(j in 1..3){
            if(j==2){
                break@outer
            }
            println("i=${i} and j=${j}")
        }
    }
}