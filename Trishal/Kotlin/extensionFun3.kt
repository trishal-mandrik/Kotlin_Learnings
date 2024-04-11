
fun main() {
    val x: Int = 6
    val y: Int = 10
    
    val greaterVal = x greaterValue y
    println(greaterVal)
}

infix fun Int.greaterValue(other: Int): Int {
    if(this > other) return this
    else return other
}