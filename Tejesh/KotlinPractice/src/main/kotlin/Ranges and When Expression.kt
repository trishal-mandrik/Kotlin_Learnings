// 1..5 = 1,2,3,4,5
// 1 until 5 = 1,2,3,4
// 1..5 step 2 = 1,3,5
// 10 downTo 1 = 10,9,8...3,2,1
// 10 downTo 1 step 2 = 10,8,6,4,2


fun main() {
    for(i in 1..5){
     print(i)
    }
    print("__")
    for (i in 1 until 5){
        print(i)
    }
    print("__")
    for ( i in 10 downTo 1){
        print(i)
    }
    println("__")
    for (i in 0..10 step 2){
        print(i)
    }
    println("__")
    val number = 12       //multiplication using ranges & for loop
    for(i in 1..10){
        println("$number x $i = ${number*i}")   //String Templating
    }

    println("-----")
    val week = "Wednesday"
    when (week){                                   //when expression
        "Monday" -> println("WORK DAY!")
        "Wednesday" -> println("WORK DAY!")
        "Friday" -> println("WORK DAY!")
        "Sunday"-> println("FIX HOlIDAY!")
        else-> println("OPTIONAL HOLIDAY")
    }
}
