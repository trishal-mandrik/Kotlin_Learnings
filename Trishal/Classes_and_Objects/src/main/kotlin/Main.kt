class Person(var firstName: String, var lastName: String){
    val fullName
        get() = "$firstName $lastName"
}

class SimplePerson(val name :String)
fun main() {
    val john = Person(firstName = "Johnny", lastName = "Appleseed")
    println(john.fullName)

    var var1 = SimplePerson(name = "Trishal")
    println(var1.name)
    var var2 = var1

    var homeOwner = john
    john.firstName = "John"

    println(john.firstName)
    println(homeOwner.firstName)

    val impostorJohn = Person(firstName = "John", lastName = "Appleseed")


}

