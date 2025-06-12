// Reference : kotlin-in-action book

data class Person(val name: String, val age: Int)

fun main() {
    val sum = { x: Int, y: Int -> x + y }
    println(sum(1, 2))

    val myFavoriteNumber = run {
        println("I'm thinking!")
        println("I'm doing some work...")
    }

    println(myFavoriteNumber)

    val people = listOf(Person("Alice", 29), Person("Bob", 31), Person("Santosh", 56))

    println(people.maxByOrNull({ p: Person -> p.age }))
    println(people.maxByOrNull() { p: Person -> p.age })
    println(people.maxByOrNull { p: Person -> p.age })
    println(people.maxByOrNull { p -> p.age })
    println(people.maxByOrNull { it.age })
    println(people.maxByOrNull(Person::age))

    val names = people.joinToString(
        separator = " ",
        transform = { p: Person -> p.name }
    )

    val age = people.joinToString(" ") { p: Person -> p.name }
    println(names)
    println(age)

    val errors = listOf("403 Forbidden", "404 Not Found")
    printMessagesWithPrefix(errors, "Error:")

    val responses = listOf(
        "200 OK", "418 I'm a teapot",
        "500 Internal Server Error", "403 Forbidden", "404 Not Found"
    )
    printProblemCounts(responses)

    val getAge = { person: Person -> person.age }
    println(getAge)

    run(::salute)

    val createPerson = ::Person
    val p = createPerson("Alice", 29)
    println(p)

    val predicate = Person::isAdult
    println(predicate(p))

    println(alphabet())

    fruitsAlso()
}

fun printMessagesWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach {
        println("$prefix $it")
    }
}

fun printProblemCounts(responses: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0

    responses.forEach {
        if (it.startsWith("4")) {
            clientErrors++
        } else if (it.startsWith("5")) {
            serverErrors++
        }
    }
    println("$clientErrors client errors, $serverErrors server errors")
}

fun salute() = println("Salute!")

fun Person.isAdult() = age >= 18

fun alphabet() = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
    toString()
}

fun fruitsAlso() {
    val fruits = listOf("Apple", "Banana", "Cherry")
    val uppercaseFruits = mutableListOf<String>()
    val reversedLongFruits = fruits
        .map { it.uppercase() }
        .also { uppercaseFruits.addAll(it) }
        .filter { it.length > 5 }
        .also { println(it) }
        .reversed()

    println(uppercaseFruits)
    println(reversedLongFruits)
}

//fun alphabet(): String {
////    val result = StringBuilder()
////    for (letter in 'A'..'Z'){
////        result.append(letter)
////    }
////    result.append("\nNow I know the alphabet!")
////    return result.toString()
//
//    val stringBuilder = StringBuilder()
//
//    return with(stringBuilder) {
//        for (letter in 'A'..'Z') {
//            append(letter)
//        }
//        append("\nNow I know the alphabet!")
//        toString()
//    }
//}

