import java.util.Scanner

// Program to Display Fibonacci Series using For loop.
fun main(args: Array<String>) {
    var n = 10
    var reader = Scanner(System.`in`)
    print("Enter t1 value: ")
    var t1 = reader.nextInt()
    print("Enter t2 value: ")
    var t2 = reader.nextInt()

    print("First $n terms: ")

    for (i in 1..n) {
        print("$t1 + ")

        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }
}


/*
//Program to Display Fibonacci Series using while loop.
fun main(args: Array<String>) {
    var n = 10
    var i = 1
    var reader = Scanner(System.`in`)
    print("Enter t1 Value: ")
    var t1 = reader.nextInt()
    print("Enter t2 Value: ")
    var t2 = reader.nextInt()

    print("First $n terms: ")

    while (i <= n){
        print("$t1 + ")

        val sum = t1 + t2
        t1 =  t2
        t2 = sum

        i++
    }
}
*/