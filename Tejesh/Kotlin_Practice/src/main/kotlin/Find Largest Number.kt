// Find the largest number using if elseif else statement
/*
fun main(args: Array<String>) {
    val n1 = 45.67
    val n2 = 25.23
    val n3 = 57.70

    if (n1 >= n2 && n1 >= n3)
        println("$n1 is the largest number.")
    else if (n2 >= n1 && n2 >= n3)
        println("$n2 is the largest number.")
    else (n3 >= n1 && n3 >= n2)
        println("$n3 is the largest number.")
}
*/

// Find the largest number using when statement
fun main(args: Array<String>) {
    val n1 = 13.81
    val n2 = 66.48
    val n3 = 37.53

    when {
        n1 >= n2 && n1 >= n3 -> println("$n1 is the largest number")
        n2 >= n1 && n2 >= n3 -> println("$n2 is the largest number")
        n3 >= n1 && n3 >= n2 -> println("$n3 is the largest number")
    }
}