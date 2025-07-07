fun main() {
    val task1 = Task("a1", "Build search feature")
    val task2 = Task("b2", "Add analytics")

    val task3 = Task("b2", "Add test")
    val task4 = Task("b2", "Add test")

    println(task1.name)
    println(task2.name)

    val task2Copy = task2.copy(id = "c3")

    val (id, name) = task1

    if (task1.name == task2.name) {
        println("Tasks are the same")
    } else {
        println("Tasks are different")
    }

    if (task3.name == task4.name) {
        println("Tasks are the same")
    } else {
        println("Tasks are different")
    }

    println("Task 2 copy: $task2Copy")
}