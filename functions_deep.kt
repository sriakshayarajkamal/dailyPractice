// ============================================================
//  FUNCTIONS DEEP DIVE
//  Topics: default args, named args, single-expression,
//          lambdas, higher-order functions, common pitfalls
// ============================================================

fun main() {

    // --------------------------------------------------------
    // 1. DEFAULT ARGUMENTS
    // --------------------------------------------------------
    // You can set a default value so the caller doesn't have to pass it
    println("--- Default Arguments ---")
    greetUser("Akshaya")          // uses default greeting
    greetUser("Akshaya", "Hey")   // overrides default

    // LOOPHOLE: if you have multiple defaults, skipping a middle one requires named args
    println(createProfile("Akshaya"))             // uses all defaults
    println(createProfile("Akshaya", age = 21))   // skip city, override age


    // --------------------------------------------------------
    // 2. NAMED ARGUMENTS
    // --------------------------------------------------------
    // Pass args by name — order doesn't matter
    println("\n--- Named Arguments ---")
    println(createProfile(name = "Akshaya", city = "Coimbatore", age = 21))

    // LOOPHOLE: mixing positional + named is allowed, but positional must come first
    println(createProfile("Akshaya", age = 21, city = "Chennai"))

    //fun createProfile(name: String, age: Int = 18, city: String = "Unknown"): String {
    //return "Name=$name | Age=$age | City=$city"
    //}


    // --------------------------------------------------------
    // 3. SINGLE-EXPRESSION FUNCTIONS
    // --------------------------------------------------------
    // When the function body is a single expression, skip the braces + return
    println("\n--- Single Expression Functions ---")
    println("Square of 5: ${square(5)}")
    println("Is even 4: ${isEven(4)}")
    println("Is even 7: ${isEven(7)}")


    // --------------------------------------------------------
    // 4. LAMBDAS
    // --------------------------------------------------------
    // A lambda is a function without a name, stored in a variable
    println("\n--- Lambdas ---")

    val multiply: (Int, Int) -> Int = { a, b -> a * b }
    println("3 * 4 = ${multiply(3, 4)}")

    // shorthand: when there's only ONE parameter, use `it`
    val double: (Int) -> Int = { it * 2 }
    println("Double 6 = ${double(6)}")

    // LOOPHOLE: `it` gets confusing inside nested lambdas — use explicit names there
    val numbers = listOf(1, 2, 3, 4, 5)
    val result = numbers.filter { outerNum -> outerNum > 2 }
                        .map    { outerNum -> outerNum * 10 }
    println("Filtered + mapped: $result")

    // if you used `it` in both, which `it` is which? => always name them in nested lambdas


    // --------------------------------------------------------
    // 5. HIGHER-ORDER FUNCTIONS
    // --------------------------------------------------------
    // A function that takes another function as a parameter
    println("\n--- Higher-Order Functions ---")

    println("Result of applyOperation(10, 3, +): ${applyOperation(10, 3) { a, b -> a + b }}")
    println("Result of applyOperation(10, 3, *): ${applyOperation(10, 3) { a, b -> a * b }}")

    // passing a lambda stored in a variable
    val subtract = { a: Int, b: Int -> a - b }
    println("Result of applyOperation(10, 3, -): ${applyOperation(10, 3, subtract)}")

    // function that returns a function
    println("\n--- Functions Returning Functions ---")
    val addFive = makeAdder(5)
    val addTen  = makeAdder(10)
    println("addFive(3) = ${addFive(3)}")   // 8
    println("addTen(3)  = ${addTen(3)}")    // 13


    // --------------------------------------------------------
    // 6. TRAILING LAMBDA SYNTAX
    // --------------------------------------------------------
    // If the last parameter is a lambda, you can move it outside the ()
    println("\n--- Trailing Lambda Syntax ---")
    repeat(3) {
        println("Trailing lambda — iteration")
    }
    // both forms are equivalent:
    doSomething("hello", { it.uppercase() })      // lambda inside
    doSomething("hello") { it.uppercase() }       // trailing lambda (preferred)


    // --------------------------------------------------------
    // 7. LAMBDA RETURN vs FUNCTION RETURN  ← common loophole
    // --------------------------------------------------------
    println("\n--- Lambda Return Loophole ---")

    // `return` inside a lambda returns from the ENCLOSING function, not just the lambda
    // Use a labeled return to return only from the lambda
    val nums = listOf(1, 2, 3, 4, 5)

    nums.forEach {
        if (it == 3) return@forEach   // skips only this iteration (labeled return)
        println("forEach value: $it")
    }
    println("forEach finished")

    // contrast: using a plain `return` here would return from main() entirely


    // --------------------------------------------------------
    // 8. FUNCTION REFERENCES (bonus)
    // --------------------------------------------------------
    println("\n--- Function References ---")
    // Instead of writing a lambda, reference an existing function with ::
    val words = listOf("apple", "banana", "cherry")
    words.forEach(::println)    // same as words.forEach { println(it) }
}


// ---- Helper functions ----

fun greetUser(name: String, greeting: String = "Hello") {
    println("$greeting, $name!")
}

fun createProfile(name: String, age: Int = 18, city: String = "Unknown"): String {
    return "Name=$name | Age=$age | City=$city"
}

// single-expression (no braces, no return keyword)
fun square(n: Int) = n * n
fun isEven(n: Int) = n % 2 == 0

// higher-order: last param is a function type
fun applyOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

// returns a function (closure)
fun makeAdder(x: Int): (Int) -> Int {
    return { n -> n + x }   // `x` is captured from the outer scope
}

fun doSomething(input: String, transform: (String) -> String) {
    println("doSomething result: ${transform(input)}")
}
