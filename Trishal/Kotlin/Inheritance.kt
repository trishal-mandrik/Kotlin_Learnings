open class Animal {
    open var color: String = ""

    open fun eat() {
        println("Animal is Eating")
    }
}

class Dog: Animal() {
    var breed: String = ""
    override var color: String = "Black"

    fun bark() {
        println("Barked")
    }

    override fun eat() {
        super.eat()
        println("Dog is Eating")
    }
}

class Cat: Animal() {
    var age: Int = -1
    override var color: String = "White"

    fun meow() {

    }

    override fun eat() {
        println("Cat is Eating")
    }
}

fun main() {
    var dog = Dog()
    dog.breed = "labra"
    dog.color = "black"
    dog.bark()
    dog.eat()

    var cat = Cat()
    cat.color = "White"
    cat.eat()

    val animal = Animal()
    animal.eat()
}