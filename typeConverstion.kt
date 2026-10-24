// Kotlin does not support implicit type conversion
// Must use explicit conversion functions

fun main() {
    val a: Int = 97

    // Int to other types
    val tolong: Long = a.toLong()
    val toDouble: Double = a.toDouble()
    val toFloat: Float = a.toFloat()
    val toByte: Byte = a.toByte()
    val toShort: Short = a.toShort()
    val toChar: Char = a.toChar()
    val toString: String = a.toString()

    println("Int value       : $a")
    println("To Long         : $tolong")
    println("To Double       : $toDouble")
    println("To Float        : $toFloat")
    println("To Byte         : $toByte")
    println("To Short        : $toShort")
    println("To Char         : $toChar")
    println("To String       : $toString")

    // String to Int
    val str = "42"
    val strToInt: Int = str.toInt()
    println("\nString to Int   : $strToInt")

    // Double to Int (decimal part is dropped)
    val d: Double = 9.99
    val doubleToInt: Int = d.toInt()
    println("Double to Int   : $doubleToInt")
}
