class Student(
    age: Int,
    firstName: String,
    lastName: String,
): Person(age, firstName, lastName) {

    override fun printName() {
        println("Student Name: $firstName $lastName, Age: $age")
    }
}