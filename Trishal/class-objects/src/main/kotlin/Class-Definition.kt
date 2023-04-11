fun main(){
    var student = Student("IntellijIDEA", 45)
    student.name = "Trishal"

    println("Student has got a name as ${student.name}")
}

class Student(var name: String) {
//    var name: String = "Dummy"
    var id: Int = -1

    init {
        println("Student has got a name as ${name} and id is $id")
    }

    //secondary constructor
    constructor(name: String, id: Int): this(name){
        this.id = id
        println("Student has got a name as ${id}")
    }
}