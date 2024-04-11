// class Student {
//     fun hasPassed(marks: Int): Boolean {
//         return marks > 40
//     }
// }

// fun Student.isScholar(marks: Int): Boolean {
//     return marks > 95
// }

// fun main() {
//     val student = Student()
//     println("Pass status: " + student.hasPassed(34))
//     println("Scholar status: " + student.hasPassed(98))
// }

fun main() {
    val str1: String = "Hello "
    val str2: String = "World"

    val str3: String = "Hey "
    println(str3.add(str1, str2))
}

fun String.add(s1: String, s2: String) : String {
    return this + s1 + s2
}