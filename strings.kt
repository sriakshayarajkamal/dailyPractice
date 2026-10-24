fun main() {

    // 1. Declaring strings
    val name: String = "Akshaya"
    val empty: String = ""
    println("Name: $name")
    println("Empty: $empty")

    // 2. String templates
    println("\n-- String Templates --")
    println("Hello $name")
    println("Length is ${name.length}")

    // 3. Common string methods
    println("\n-- String Methods --")
    val str = "Hello Akshaya"
    println("length        : ${str.length}")
    println("uppercase     : ${str.uppercase()}")
    println("lowercase     : ${str.lowercase()}")
    println("reversed      : ${str.reversed()}")
    println("trim          : ${"  hello  ".trim()}")
    println("replace       : ${str.replace("Hello", "Hi")}")
    println("contains      : ${str.contains("Akshaya")}")
    println("startsWith    : ${str.startsWith("Hello")}")
    println("endsWith      : ${str.endsWith("Akshaya")}")
    println("substring(6)  : ${str.substring(6)}")
    println("substring(0,5): ${str.substring(0, 5)}")
    println("split         : ${str.split(" ")}")
    println("isEmpty       : ${str.isEmpty()}")
    println("isBlank       : ${str.isBlank()}")
    println("index [0]     : ${str[0]}")

    // 4. Multiline strings
    println("\n-- Multiline String --")
    val text = """
        Hello
        My name is Akshaya
        I am learning Kotlin
    """.trimIndent()
    println(text)

    // 5. String equality
    println("\n-- String Equality --")
    val a = "hello"
    val b = "hello"
    println("a == b  : ${a == b}")   // content check
    println("a === b : ${a === b}")  // reference check

    println("BuildString examples")
    val builtStr = buildString {
        append("Hello")
        append(" Akshaya")
    }
    println(builtStr)
}
