open class MySuperClass {
    open fun myMethod(str: String) {
        println("MySuperClass")
    }
}

object CustomerData: MySuperClass() {   // Object Declaration

    var count: Int = -1       // Behaves like a STATIC variable

    fun typeOfCustomers(): String { // Behaves like a STATIC method
        return "Indian"
    }

    override fun myMethod(str: String) {
        super.myMethod(str)
        println("object customer data : $str")
    }
}

fun main() {
    CustomerData.count = 98
    CustomerData.typeOfCustomers()
    println(CustomerData.count)


    println(CustomerData.typeOfCustomers())

    CustomerData.count = 109
    println(CustomerData.count)

    CustomerData.myMethod("hello")


}