import java.math.BigInteger
import java.util.Scanner

// Find Factorial of a number using for loop
fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)
    print("Enter a Number: ")
    var num = reader.nextInt()
    var factorial : Long = 1

    for (i in 1..num){
        factorial *= i.toLong()    //factorial = factorial*i
    }
    println("Factorial of $num = $factorial")
}

/*
// Find Factorial of a number using while loop
fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)
    print("Enter a Number: ")
    var num = reader.nextInt()
    var i = 1
    var factorial : Long = 1

    while (i <= num) {
        factorial *= i.toLong()
        i++
    }
    println("Factorial of $num = $factorial ")
}
*/

/*
//Find Factorial of a Number using BigInt
fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)
    print("Enter a Number: ")
    var num = reader.nextInt()
    var factorial = BigInteger.ONE

    for (i in 1..num) {
        factorial = factorial.multiply(BigInteger.valueOf(i.toLong()))
    }
    println("Factorial of $num = $factorial")
}
*/