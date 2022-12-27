import java.sql.DriverManager.println

class myClass{
    private var name: String = "helloworld.com"

    fun printMe() {
        println("The best learning website - " + name)
    }
}

fun main(){
    val obj = myClass()
    obj.printMe()
}