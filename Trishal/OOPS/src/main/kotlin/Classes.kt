class myClass {
    private var name : String = "helloworld.com"

    fun printMe() {
        print("The best learning website - " + name)
    }
}

fun main(){
    val obj = myClass()
    obj.printMe()
}