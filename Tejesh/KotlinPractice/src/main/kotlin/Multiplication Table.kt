import java.util.Scanner

// Program to get Multiplication Table using for loop
fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)
    print("Enter Your Table Number: ")
    var num = reader.nextInt()

    for (i in 1..10){
        var product = num * i
        println("$num * $i = $product")
    }
}


/*
// Program to get Multiplication Table using while loop
fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)
    print("Enter Your Table Number: ")
    var num = reader.nextInt()
    var i = 1

    while (i <= 10){
        var product = num * i
        println("$num * $i = $product")
        i++
    }
}
*/