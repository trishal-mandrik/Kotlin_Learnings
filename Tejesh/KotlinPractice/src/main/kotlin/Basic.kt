import com.sun.jdi.Value


fun main(args: Array<String>) {
    /*val age:Int = 25

    if (age > 18) {        //if else condition
        print("Adult")
    } else {
        print("Minor")
    }*/


    /* val age:Int = 10

     val result = if (age > 18) {
         "Adult"
     } else {
         "Minor"
     }
     println(result)*/

    val day = 3
    val result = when (day) {     //when condition
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)

    when (day) {
        in 1..5 -> println("Weekday")
        else -> println("Weekend")
    }
}


/*
fun main(args: Array<String>) {
    /*
    val expression = object {
    val  property = " "

        fun method(): Int {
            println("From an object expressions")
            return 25
}
}
    val i ="${expression.method()} ${expression.property}"
    println(i)
*/
    val numbers = 10 downTo 1 // 1..10

    for ( a in numbers) {
        println (a)
    }

    for (a in 100 downTo 1 step 5){   //having decrement with gap of 5
        println(a)
    }
    val capitals = listOf("London","Paris","Delhi","Madrid")
    for(capital in capitals)
        println(capital)                        //print listof string

//multiplication of tables using for loop
    val num = 5

    for (i in 1..10){
        val product = num * i
        println("$num * $i = $product")
    }

    val int : Int = 188
    val floatnumber : Float = int.toFloat()    //conversion of datatype Int-->>Float
    println(floatnumber)

    val note = "recycle it \n"            //  \n is also used to print in nextline
    print(note)
}
*/

