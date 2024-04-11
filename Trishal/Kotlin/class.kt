fun main() {
    var student = Student("Trishal")
    println(student)
}

class Student(name: String) {

    init {
        println("Student has got a name as $name")
    }
}