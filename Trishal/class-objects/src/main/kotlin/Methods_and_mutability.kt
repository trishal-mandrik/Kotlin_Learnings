//class Grade(
//    val letter: String,
//    val points: Double,
//    val credits: Double
//)
//
//class Student(
//    val firstName: String,
//    val lastName: String,
//    val grades: MutableList<Grade> = mutableListOf(),
//    var credits: Double = 0.0
//) {
//    val avgGrades get() = (grades.sumOf { it.points })/(credits);
//    fun recordGrade(grade: Grade){
//        grades.add(grade)
//        credits += grade.credits
//    }
//}
//
//fun main() {
//    val jane = Student(firstName = "Jane", lastName = "Appleseed")
//    val history = Grade(letter = "B", points = 9.0, credits = 3.0)
//    var math = Grade(letter = "A", points = 16.0, credits = 4.0)
//
//    jane.recordGrade(history)
//    jane.recordGrade(math)
//
//    println(jane.credits)
//    math = Grade(letter = "A", points = 20.0, credits = 5.0)
//    jane.recordGrade(math)
//    println(jane.credits)
//
////    jane = Student(firstName = "Jane", lastName = "Appleseed") //val cannot be reassigned
//}