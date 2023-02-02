import java.util.*

fun main(args: Array<String>){

    println("Hello SND, with String[] array as argument: "+ Arrays.toString(args))

    var mutableVarUninitialized : String
    var mutableVarInitialized : String = "initialized"
    //println(mutableVarUninitialized)
    println(mutableVarInitialized)

    val immutableVarWithType : Int = 1
    println("immutableVarWithType: $immutableVarWithType")
    val immutableVarWOType = 3.0
    println("immutableVarWOType: $immutableVarWOType")

/*
    Kotlin built in data type can be categorized as follows:
    * Number
    * Character
    * String
    * Boolean
    * Array
*/
    //Number:
    val a: Int = 10000
    val d: Double = 100.00
    val f: Float = 100.00f
    val l: Long = 1000000004
    val s: Short = 10
    val b: Byte = 1

    println("Int Value is $a")
    println("Double  Value is $d")
    println("Float Value is $f")
    println("Long Value is $l")
    println("Short Value is $s")
    println("Byte Value is $b")

    //Character:
    val c1: Char = 'A'
    val c2: Char = '1'
    println(c1+" "+c2)
    println("$c1 $c2")

    /*Here is a list of escape characters supported in Kotlin:
    \t - Inserts tab
    \b - Inserts backspace
    \n - Inserts newline
    \r - Inserts carriage return (replace)
    \' - Inserts single quote character
    \" - Inserts double quote character
    \\ - Inserts backslash
    \$ - Inserts dollar character
     */
    println("Hi\tTeam")
    println("Hi\bTeam")
    println("Hi\nTeam")
    println("Hi\rHello Team")
    println("\'")
    println("\"")
    println("\\")
    println("\$")
    println("$")
    println("\$a")
    println("$a")

}