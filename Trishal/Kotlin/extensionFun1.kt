class Student {
    fun hasPassed(marks: Int): Boolean {
        return marks > 40
    }
}

fun Student.isScholar(marks: Int): Boolean {
    return marks > 95
}

fun main() {
    val student = Student()
    println("Pass status: " + student.hasPassed(34))
    println("Scholar status: " + student.hasPassed(98))
}