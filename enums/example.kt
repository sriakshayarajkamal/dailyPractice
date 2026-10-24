enum class TrafficLight{ //traffic light "enum class'
    RED, YELLOW, GREEN //are called constants
}
enum class Menu(val price: Int) {
    COFFEE(50),
    TEA(30),
    JUICE(60)
}
fun signal(light:TrafficLight){
    println(light)
}
 // 50
fun main(){
    val light = TrafficLight.RED //type is TrafficLight light is variable
    // variable    enum constant 
    println("type is the classname ${light}")
    println(light.name) // gives "red" string
    println(light.ordinal)

    println()
    println("Why does the type matters")
    if(light == TrafficLight.RED){
        println("stop")
    }
    if(light == TrafficLight.GREEN){
        println("Go")
    }

    println()
    println("Using function and ornting passed value")
    var lightGreen = TrafficLight.GREEN
    signal(lightGreen)

    println()
    println("checking")
    var light1 = TrafficLight.BLUE
    println(light1)
    println(light1.name is String)
    println(light1.ordinal)

    println()
    println("Using when")
    when(lightGreen){
        TrafficLight.RED -> println("stop")
        TrafficLight.GREEN -> println("GO")
    }


    println()
    println("coffee example")
    println(Menu.COFFEE.price)  

    
}