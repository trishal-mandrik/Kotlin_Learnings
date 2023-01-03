// Check Number is even or odd by if else condition.
import java.util.Scanner

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)

    print("Enter a Number: ")
    val number = reader.nextInt()

    if (number % 2 == 0) {
        println("$number is an even")
    }
    else {
        println("$number is an odd")
    }
}

/*
// Check Number is even or odd by if else expression
fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)

    print("Enter a Number: ")
    val number = reader.nextInt()

    val evenOdd = if(number % 2 == 0) "even" else "odd"
    println("$number is $evenOdd")
}
*/