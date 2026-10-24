fun main() {

    val isLoggedIn = true

    try {

        check(isLoggedIn) {
            "User is not logged in"
        }

        println("Welcome!")

    } catch (e: IllegalStateException) {

        println(e.message)

    }

    println("Program continues...")
}