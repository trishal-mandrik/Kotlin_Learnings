//Program to calculate the sum of natural numbers using for loop.

fun main(args: Array<String>) {
    var num = 20
    var sum = 0

    for (i in 1..num){
        // sum = sum+i;
        sum += i
    }
    println("Sum = $sum")
}

//Program to calculate the sum of natural numbers using while loop
/*
fun main(args: Array<String>) {
    var num = 50
    var i = 1
    var sum = 0

    while (i <= num){
        sum += i
        i++
    }
    println("Sum = $sum")
}
*/