import java.util.Scanner

//Program to check Palindrome Number
fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)
    print("Enter Your Number: ")
    var num = reader.nextInt()

    var reversedInteger = 0
    var remainder: Int
    val originalInteger: Int

    originalInteger = num

    // reversed integer is stored in variable
    while (num != 0) {
        remainder = num % 10
        reversedInteger = reversedInteger * 10 + remainder
        num /= 10
    }

    // palindrome if orignalInteger and reversedInteger are equal
    if (originalInteger == reversedInteger)
        println("$originalInteger is a palindrome.")
    else
        println("$originalInteger is not a palindrome.")

}