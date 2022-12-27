class Outer1{
    private val welcomeMessage: String = "Welcome to kotlin"
    inner class Inner{
        fun foo() = welcomeMessage
    }
}

fun main(){
    val obj = Outer1().Inner()
    print(obj.foo())
}