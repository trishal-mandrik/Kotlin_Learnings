//Program to print an Integer using Scanner

import java.util.Scanner

fun main(args: Array<String>) {
    //created a reader instances which takes input from keyboard
    val reader = Scanner(System.`in`)
    print("Enter Phone Number: ")

    //nextLong() reads the next long number from the keyboard
    var long = reader.nextLong()

    //println() prints the following line to the output console
    println("Your Phone Number: $long")
}


/*
//Program to print an Integer without using Scanner
fun main(args: Array<String>) {
    print("Enter Phone Number: ")

    //readLine from input-> keyboard and !! operator ensures input is not NULL.
    val integerInput = readLine()!!

    //convert the integer input to long
    var long = integerInput.toLong()

    //println() prints the output
    println("Your Phone Number: $long")
}
 */