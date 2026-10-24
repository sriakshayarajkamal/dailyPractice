fun main(){
    var circle = Circle("Black",44.6)
    circle.area()

    var rectangle = Rectangle("Red",4,5)
    rectangle.area()
}
open class Shape(var color:String){
    open fun display(){
        println("it is ${color} color") 
    }
}
class Circle(color:String,var radius:Double) : Shape(color){
    fun area(){
        var res = 3.14*radius*radius
        display()
        println("the area is ${res}")
    }
}
class Rectangle(color:String,val len:Int, val wid:Int) : Shape(color){
    fun area(){
        display()
        println("the area is ${len*wid}")
    }
}