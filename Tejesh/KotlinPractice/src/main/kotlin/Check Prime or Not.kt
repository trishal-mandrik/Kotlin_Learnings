import java.util.Scanner
/*
//Program to Check Number is Prime or Not! using for loop
fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)
    print("Enter Your Number: ")
    var num = reader.nextInt()

    var flag = false

        for (i in 2..num / 2) {
            // condition for non prime number
            if (num % i == 0) {
                flag = true
                break
            }
        }

        if (!flag)
            println("$num is a prime number.")
        else
            println("$num is not a prime number.")
}
*/

//Program to Check Number is Prime or Not! using a while loop.
fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)
    print("Enter Your Number: ")
    var num = reader.nextInt()

    var i = 2
    var flag = false

    while (i <= num / 2) {
        // condition for nonprime number
        if (num % i == 0) {
            flag = true
            break
        }
        ++i
    }

    if (!flag)
        println("$num is a prime number.")
    else
        println("$num is not a prime number.")
}
