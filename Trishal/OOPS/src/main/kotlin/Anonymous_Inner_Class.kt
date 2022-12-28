fun main(){
    val programmer: Human = object:Human {
        override fun think(){
            print("I'm an example of Anonymous Inner Class ")
        }
    }
    programmer.think()
}

interface Human{
    fun think()
}