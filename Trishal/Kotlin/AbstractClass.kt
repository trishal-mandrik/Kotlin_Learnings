abstract class Person {
    abstract var name: String
    abstract fun getHeight()
    fun goToSchool() {}
}

class Indian: Person() {
    
    override fun getHeight() {
        println("Height")
    }

    override var name: String = "Trishal"
}

fun main() {
    var person = Indian()

    person.getHeight()
}