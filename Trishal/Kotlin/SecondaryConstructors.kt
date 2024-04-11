fun main() {
    var student = Student("Trishal", 20)
    print(student.id)
}

class Student(var name: String) {
    var id: Int = -1

    init {
        println("Student has got a name as $name")
    }

    constructor(n: String, id: Int): this(n) {
        this.id = id
        println("Inside secondary constructor")
    }
}