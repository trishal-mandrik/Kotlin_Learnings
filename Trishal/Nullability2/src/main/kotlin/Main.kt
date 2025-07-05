class Person(val firstName: String, val lastName: String) {
    override fun equals(other: Any?): Boolean {
        val otherPerson = other as? Person?: return false
        return otherPerson.firstName == firstName &&
               otherPerson.lastName == lastName
    }

    override fun hashCode(): Int = firstName.hashCode() + lastName.hashCode()
}

fun main() {
    val p1 = Person("Dmitry", "Jemerov")
    val p2 = Person("Dmitry", "Jemerov")

    println(p1 == null)

    println(p1 == p2) // true

    println(p1.equals(42))
}