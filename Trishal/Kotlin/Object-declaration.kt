open class MySuperClass {
    open fun myMethod(str: String) {
        println("MySuperClass")
    }
}

object CustomerData : MySuperClass() {
    // can contain init block as well
    init {

    }
    
    var count: Int = -1

    fun typeOfCustomers(): String {
        return "Indian"
    }
}

fun main() {
    CustomerData.count = 98
    println(CustomerData.typeOfCustomers())
    CustomerData.myMethod("")
}