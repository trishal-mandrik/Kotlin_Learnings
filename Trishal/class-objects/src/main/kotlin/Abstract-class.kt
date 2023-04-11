//Abstract Class

abstract class MyPerson { //instance cannot be created of abstract classes
    abstract var name: String
    abstract fun eat() //abstract properties are open by default
    open fun getHeight() {} // A 'open' function ready to be overridden
    fun goToSchool() {} //A normal function
}

class Indian : MyPerson() {
    override var name: String = "dummy_indian_name"

    override fun eat() {
        //our own code
    }

}

fun main() {
//    var person = MyPerson()   // Not allowed. You cannot create instance of abstract class

    var person = Indian() // Allowed. Abstract Super class reference variable
                          // pointing to child class object.

    person.name = "Steve"
    person.eat()
    person.goToSchool()
}