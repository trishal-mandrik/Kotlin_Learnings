open class Person(
    val age: Int,
    protected val firstName: String,
    protected val lastName: String,
) {

    init {
        check(age >= 0) { "Age must be non-negative" }
    }

    open fun printName() = println("$firstName $lastName")
}