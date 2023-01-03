import java.util.Scanner
//Program to find number is positive or negative using if else if statement
/*
fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)
    println("Enter a Number: ")
    var number : Double = reader.nextDouble()

    if (number < 0.0)
        println("$number is a Negative Number.")
    else if(number > 0.0)
        println("$number is a Positive Number.")
    else
        println("Number is Zero.")
}
*/

// Program to find number is positive or negative using when statement
fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)
    println("Enter a Number: ")
    var number : Double = reader.nextDouble()

    when {
        number < 0.0 -> println("$number is a negative number.")
        number > 0.0 -> println("$number is a positive number.")
        else -> println("$number is a Zero.")
    }

}
