fun main() {
    val myNumbers: List<Int> = listOf(2,3,4,6,23,90)

    val mySmallNums = myNumbers.filter { it < 10 } // OR { num -> num < 10 }
    println(mySmallNums)

    val mySquaredNums = myNumbers.map { it * it }
    println(mySquaredNums)

    val people =listOf<Person>(Person(10, "Naman"), Person(27, "Trishal"), Person(19, "Manisha"))
    val names = people.map { it.name }
    val person = people.filter{ it.name == "Trishal" }.map { it.age }
    println(person)
    println(names)
}

class Person(var age: Int, var name: String) {}