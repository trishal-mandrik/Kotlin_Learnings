class Employee(val name: String, val manager: Employee?)
class Address(val streetAddress: String, val zipCode: Int, val city: String, val country: String)
class Company(val name: String, val address:Address?)
class Person(val name:String, val company: Company?)

//fun Person.countryName(): String{
//    val country = this.company?.address?.country
//    return if(country != null) country else "Unknown"
//}

fun Person.countryName() = company?.address?.country ?: "Unknown"

fun managerName(employee: Employee): String? = employee.manager?.name

fun main() {
    println(strLen(null))

//    val x: String = null // error

    val x: String? = null
    println(strLen(x))
    // ERROR: Type mismatch:
    // inferred type is String? but String was expected

    val ceo = Employee("Da Boss", null)
    val developer = Employee("Bob Smith", ceo)
    println(managerName(developer))
    //Da Boss
    println(managerName(ceo))
    //null

    val person = Person("Dmitry", null)
    println(person.countryName())
    greet("Trishal")

    println(strLenSafe("Trishal"))
    println(strLenSafe(null))

    val address = Address("Elsestr. 47", 80687, "Munich", "Germany")
    val jetbrains = Company("JetBrains", address)
    val person1 = Person("Dmitry", jetbrains)
    printShippingLabel(person1)

//    printShippingLabel(Person("Alexey", null))
}

fun strLen(s: String?) = s?.length

fun greet(name: String?) {
    val recipient: String = name ?: "unnamed"
    println("Hello, $recipient")
}

fun strLenSafe(s: String?): Int = s?.length?:0

fun printShippingLabel(person: Person) {
    val address = person.company?.address?:throw IllegalArgumentException("No address")

    with(address) {
        println(streetAddress)
        println("$zipCode $city, $country")
    }
}