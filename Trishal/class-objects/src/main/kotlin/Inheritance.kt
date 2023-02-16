//import java.sql.Struct
//
////By default kotlin classes and variables inside those classes are public and final in nature
////For inheritance we have make the class open
//
//open class Animal {
//    open var color: String = ""
//
//    open fun eat(){
//        println("Animal is Eating")
//    }
//}
//
//class Dog: Animal() {
//    var bread: String = ""
//    override var color: String = "Brown"
//    fun bark() {
//        println("Dog is Barking and color is $color")
//    }
//
//    override fun eat(){
//        super<Animal>.eat()
//        super.eat()
////        println("Dog is eating")
//    }
//}
//
//class Cat : Animal() {
//    var age: Int = -1
//
//    fun meow() {
//        println("Meow")
//    }
//
//    override fun eat() {
//        super.eat()
//        println("Cat is eating")
//    }
//}
//
//fun main() {
//    var dog = Dog()
//    dog.bread = "labra"
////    dog.color = "black"
//    dog.bark()
//    dog.eat()
//
//    var cat = Cat()
//    cat.age = 7
//    cat.color = "brown"
//    cat.meow()
//    cat.eat()
//
////    var animal = Animal()
////    animal.color = "white"
////    animal.eat()
//
//
//}