import java.util.*

//Program to Check Character is Alphabet or Not using if else

fun main(args: Array<String>) {
    val c = '4'

    if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')
        println("$c is an alphabet.")
    else
        println("$c is not an alphabet")
}


//Program to Check Character is Alphabet or Not using if else with ranges
/*
fun main(args: Array<String>) {
    val c = 'O'

    if (c in 'a'.. 'z' || c in 'A'..'Z')
        println("$c is an alphabet.")
    else
        println("$c is not an alphabet")
}
*/

//Program to Check Character is Alphabet or Not using when statement
/*
fun main(args: Array<String>) {
    val c ='*'

    when {
        (c in 'a'..'z'|| c in 'A'..'Z') -> println("$c is an alphabet.")
        else -> println("$c is not an alphabet.")
    }
}
*/
