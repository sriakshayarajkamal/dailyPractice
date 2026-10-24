// ============================================================
//  SCOPE FUNCTIONS — let, run, with, apply, also
//
//  The two axes to remember:
//    1. How you refer to the object inside the block:
//       - as `it`   → let, also
//       - as `this` → run, with, apply
//    2. What the block returns:
//       - lambda result  → let, run, with
//       - the object itself (receiver) → apply, also
//
//  Quick cheat sheet:
//  | Function | object ref | returns        | typical use                 |
//  |----------|------------|----------------|-----------------------------|
//  | let      | it         | lambda result  | null checks, transform      |
//  | run      | this       | lambda result  | init + compute result       |
//  | with     | this       | lambda result  | group operations, no chain  |
//  | apply    | this       | the object     | builder / config pattern    |
//  | also     | it         | the object     | side effects, logging       |
// ============================================================

data class User(var name: String, var age: Int, var email: String = "")
data class Address(var street: String = "", var city: String = "", var zip: String = "")

fun main() {

    // --------------------------------------------------------
    // 1. let  — `it`, returns lambda result
    // --------------------------------------------------------
    // Best for: null-safety checks, transforming a value
    println("===== let =====")

    val name: String? = "Akshaya"

    // most common use: safe call + let to run code only if non-null
    val length = name?.let {
        println("Name is not null: $it")
        it.length   // this is the return value of the let block
    }
    println("Length: $length")   // 7

    // null case
    val nullName: String? = null
    val result = nullName?.let {
        it.uppercase()
    }
    println("Result on null: $result")   // null (block never runs)

    // let for transformation chains
    val transformed = "  hello world  "
        .trim()
        .let { it.replaceFirstChar { c -> c.uppercase() } }  // capitalize
        .let { "[$it]" }
    println("Transformed: $transformed")

    // LOOPHOLE: `it` inside nested lets — name them to avoid confusion
    val outer = listOf(1, 2, 3)
    outer.let { outerList ->
        outerList.filter { num -> num > 1 }   // `it` here is each element, not the list
                 .let { filtered -> println("Nested let: $filtered") }
    }


    // --------------------------------------------------------
    // 2. run  — `this`, returns lambda result
    // --------------------------------------------------------
    // Best for: initializing an object AND computing something from it
    println("\n===== run =====")

    val user = User("Akshaya", 20)

    val greeting = user.run {
        // `this` = user, so you can access properties directly
        age += 1          // modifying the object inside run
        "Hello, $name! You are now $age."  // lambda result = this string
    }
    println(greeting)
    println("User after run: $user")   // age is 21 now

    // run without receiver — just execute a block and get a result
    val computed = run {
        val x = 10
        val y = 20
        x + y   // returns 30
    }
    println("run without receiver: $computed")

    // LOOPHOLE: `this` can be shadowed inside nested scope functions
    // If you nest apply/run, the inner `this` overrides the outer one
    val address = Address().apply {
        street = "123 Main St"
        // if you called user.run{} here, `this` would become user, losing address
    }
    println("Address: $address")


    // --------------------------------------------------------
    // 3. with  — `this`, returns lambda result
    // --------------------------------------------------------
    // Best for: grouping multiple operations on the same object
    // NOT an extension function — object is passed as argument
    println("\n===== with =====")

    val user2 = User("Ram", 25, "ram@email.com")

    val summary = with(user2) {
        // `this` = user2
        println("Inside with: $name, $age")
        "User: $name | Age: $age | Email: $email"   // returned
    }
    println("Summary: $summary")

    // LOOPHOLE: `with` doesn't work well with nullable objects
    // with(nullableObj) { ... } — this will crash if nullableObj is null
    // Use let or run with ?. instead
    val maybeUser: User? = null
    // DON'T: with(maybeUser) { ... }  <-- NullPointerException
    // DO:
    maybeUser?.run { println("Safe: $name") } ?: println("User was null — safe handled")


    // --------------------------------------------------------
    // 4. apply  — `this`, returns THE OBJECT
    // --------------------------------------------------------
    // Best for: configuring/building an object (builder pattern)
    println("\n===== apply =====")

    val newUser = User("", 0).apply {
        name  = "Priya"
        age   = 22
        email = "priya@example.com"
    }
    println("Built user: $newUser")

    // classic builder pattern with apply
    val address2 = Address().apply {
        street = "45 Park Lane"
        city   = "Coimbatore"
        zip    = "641001"
    }
    println("Address: $address2")

    // chaining apply — still returns the object each time
    val user3 = User("Dev", 19)
        .apply { email = "dev@example.com" }
        .apply { age   = 20 }
    println("Chained apply: $user3")

    // LOOPHOLE: apply returns the receiver (object), NOT the lambda result
    // If you want to return a computed value, use let or run instead
    val applyResult = user3.apply { name = "DevUpdated" }
    println("applyResult type is User: ${applyResult is User}")   // true — it's the object


    // --------------------------------------------------------
    // 5. also  — `it`, returns THE OBJECT
    // --------------------------------------------------------
    // Best for: side effects (logging, debugging) without interrupting a chain
    println("\n===== also =====")

    val numbers = mutableListOf(3, 1, 4, 1, 5)
        .also { println("Before sort: $it") }   // side effect
        .apply { sort() }                        // mutate
        .also { println("After sort:  $it") }   // side effect

    println("Final: $numbers")

    // also for debugging in a chain
    val processedName = "  akshaya  "
        .trim()
        .also { println("After trim: '$it'") }
        .uppercase()
        .also { println("After uppercase: '$it'") }

    println("Processed: $processedName")


    // --------------------------------------------------------
    // 6. CHOOSING THE RIGHT SCOPE FUNCTION — summary practice
    // --------------------------------------------------------
    println("\n===== CHOOSING THE RIGHT ONE =====")

    val input: String? = "kotlin"

    // null check + transform → let
    val upper = input?.let { it.uppercase() }
    println("let result: $upper")

    // configure an object → apply
    val configuredUser = User("", 0).apply {
        name = "Akshaya"
        age  = 20
    }
    println("apply result: $configuredUser")

    // multiple calls on same object, return a value → run or with
    val message = configuredUser.run {
        "Welcome back, $name!"
    }
    println("run result: $message")

    val message2 = with(configuredUser) {
        "Age next year: ${age + 1}"
    }
    println("with result: $message2")

    // side effect in a chain → also
    val finalList = listOf(1, 2, 3)
        .also { println("also sees: $it") }
        .map { it * 2 }
    println("final list: $finalList")


    // --------------------------------------------------------
    // 7. LOOPHOLES SUMMARY
    // --------------------------------------------------------
    println("\n===== LOOPHOLES =====")

    // 1. apply vs run return difference
    val obj = User("Test", 1)
    val fromApply : User   = obj.apply { name = "FromApply" }  // returns User
    val fromRun   : String = obj.run   { "FromRun: $name" }    // returns String
    println("apply returned: $fromApply")
    println("run returned:   $fromRun")

    // 2. with is NOT safe for nullables — use run with ?. instead
    val safeResult = maybeUser?.run { "Got: $name" } ?: "Was null"
    println("Safe null handling: $safeResult")

    // 3. `this` vs `it` in nested scope functions — always be explicit
    val u = User("Akshaya", 20)
    u.apply {
        // `this` = u here
        listOf(1, 2, 3).also { nums ->
            // `it` would be ambiguous — we named it `nums`
            println("Inside apply>also: user=$name, nums=$nums")
        }
    }

    // 4. Mutating inside let/run/with mutates the original object
    val mutableUser = User("Original", 20)
    mutableUser.let {
        it.name = "Changed inside let"   // this DOES change the original
    }
    println("After let mutation: ${mutableUser.name}")  // "Changed inside let"
}
