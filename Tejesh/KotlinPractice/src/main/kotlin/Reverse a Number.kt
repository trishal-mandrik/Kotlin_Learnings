import java.util.Scanner

//Program to Reverse a Number
fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)
    print("Enter a Numbers: ")
    var num = reader.nextInt()
    var reverse = 0

    while (num != 0){
        val digit = num % 10
        reverse = reverse * 10 + digit
        num /= 10
    }
    println("Reversed Number: $reverse")
}