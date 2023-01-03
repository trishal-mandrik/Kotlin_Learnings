import java.util.Scanner

//Program to check leap year using if else statement

fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)
    print ("Enter a year: ")            //user input
    var year: Int = reader.nextInt()
    var leap = false

    if (year % 4 == 0){
        if (year % 100 == 0){
            leap = year % 400 == 0  //year is divisible by 400, hence the year is a leap year
        } else
            leap = true
    }else
        leap = false
    println(if (leap) "$year is a leap year." else "$year is not a leap year.")
}


// Program to check leap year using when statement
/*
fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)
    print("Enter a year: ")           //user input
    var year: Int = reader.nextInt()
    var leap = false

    leap = when {
        year % 4 == 0 -> {
            when{
                year % 100 == 0 -> year % 400 == 0
                else -> true
            }
        }
        else -> false
    }
    println(if (leap)"$year is a leap year." else "$year is not a leap year.")
}
*/
