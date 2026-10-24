fun main() {
    val person = Person()   // ← declare first

    val result1 = person.run {
        "Hello $name"
    }

    val result2 = with(person) {
        "Hello $name"
    }

    println(result1)
    println(result2)
}

class Person(var name: String = "Akshaya")
