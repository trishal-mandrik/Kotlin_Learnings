class Company {
    var name: String = "Defaultvalue"
        get() = field
        set(value){
            field = value
        }
}

fun main() {
    val c = Company()
    c.name = "GeeksforGeeks"
    println(c.name)
}