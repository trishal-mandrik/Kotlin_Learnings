

fun main() {
    MyClass.count
    println(MyClass.typeOfCustomers())
}

class MyClass {
    companion object {
        var count: Int = -1

        @JvmStatic
        fun typeOfCustomers(): String {
            return "Indian"
        }
    }
}