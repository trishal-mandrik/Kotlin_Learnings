class Outer{
    class Nested{
        fun foo() = "Welcome to kotlin"
    }
}

fun main(){
    val obj = Outer.Nested()

    print(obj.foo())
}