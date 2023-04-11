//class Car {
//    var brand = ""
//    var model = ""
//    var year = 0
//
//}

//class Car(var brand: String, var model: String, var year: Int)
class Car(var brand: String, var model: String, var year: Int) {
    //class function
    constructor(brand: String,model: String):this(model,brand,1)

    fun drive(){
        println("Wrooom")
    }

    fun speed(maxSpeed : Int) {
        println("Max speed is: " + maxSpeed)
    }
}

fun main() {
    val c1 = Car("Ford", "Mustang", 1969);

//    c1.brand = "Ford";
//    c1.model = "Mustang";
//    c1.year = 1969

    //call the function

    c1.drive()
    c1.speed(300)
    println(c1.brand);
    println(c1.model)
    println(c1.year)
}