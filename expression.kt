// in Java, if is a statement. In Kotlin it is an expression

fun main() {
    val a = 10
    val b = 20

    // used as a statement (just executing)
    if (a > b) {
        println("a is greater")
    } else {
        println("b is greater")
    }

    // used as an expression (storing the result)
    val c = 3
    val d = 4
    val max = if (c < d) c else d
    println("Max: $max")

    var res = 4<5 ? "yes":"no"
    println(res)
}
