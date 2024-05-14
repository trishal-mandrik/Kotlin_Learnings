fun main(){
    var person = Person()

    with(person) {
        name = "Trishal"
        age = 27
    }

    person.apply {
        name = "Mandrik"
        age = 28
    }.startRun()

    println(person.name)
    println(person.age)
}

class Person() {
    var name: String = ""
    var age: Int = -1

    fun startRun() {
        println("Now I am ready to run")
    }
}