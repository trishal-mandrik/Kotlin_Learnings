import java.util.Scanner

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)
    print("Enter any number from 1 to 7: ")
    val day = sc.nextInt()

    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid entry!! Please try entering from 1 to 7."
    }
    println(result)

    if (day in 1..7) {
       when (day){
           in 1..5 -> println("Weekday")
           else -> println("Weekend")
       }
    } else {
        println("Invalid entry!! Please try entering from 1 to 7.")

    }

    print("Enter any alphabet from a to g: ")
    val dayy = sc.next()

    val resultt = when(dayy){
        "a" -> "Monday"
        "b" -> "Tuesday"
        "c" -> "Wednesday"
        "d" -> "Thursday"
        "e" -> "Friday"
        "f" -> "Saturday"
        "g" -> "Sunday"
        else -> "Invalid entry!! Please try entering from a to g."
    }
    println(resultt)

}