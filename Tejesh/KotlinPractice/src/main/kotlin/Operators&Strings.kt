
// Comments:
//Single Line Comments Which start with two forward slashes(//) so whole line is ignored by kotlin

/*
Multi Line Comments starts with (/*) and ends with (*/).
 Any text between them will be ignored by kotlin
 */


/*
//Operators:
fun main(args: Array<String>) {
    val a = 100 + 50  //so here 100 & 50 are two operands and (+) is a operator to perform operation between them.
    println(a)

    var sum1 = 100 + 50
    var sum2 = sum1 + 250     //we can also be used to add together a variable and a value, or a variable and a variable
    var sum3 = sum2 + sum2
    println("$sum1 $sum2 $sum3" )

    println("--------------------")

   /* 4 types of operators in kotlin are:
      ▫ Arithmetic Operators
      ▫ Assignment Operators
      ▫ Comparison Operators
      ▫ Logical Operators
   */

    /* *** Arithmetic operators *** */
    val x: Int = 40
    val y: Int = 20
    var z: Int = 30

    println("x + y = " +  (x + y))  //addition
    println("x - y = " +  (x - y))  //subtraction
    println("x * y = " +  (x * y))  //multiplication
    println("x / y = " +  (x / y))  //division
    println("x % y = " +  (x % y))  //modulus

    println(++z)      //Increment (prefix)
    println(z++)      //Increment (postfix)
    println(z)
    println(--z)      //Decrement (prefix)
    println(z--)      //Decrement (postfix)
    println(z)

    println("--------------------")

    /* ** Comparison Operator ** */
    println("x > y = " +  (x > y))    //greater than
    println("x < y = " +  (x < y))    //less than
    println("x >= y = " +  (x >= y))  //greater than or equal to
    println("x <= y = " +  (x <= y))  //less than equal to
    println("x == y = " +  (x == y))  //equal to
    println("x != y = " +  (x != y))  //not equal

    println("--------------------")

    /* *** Assignment operators *** */
    var u = 50                      //assigned value 50 to variable u
    u += 10                         //add value to variable
    println(u)
    u -= 5
    println(u)
    u *= 2
    println(u)
    u /= 11
    println(u)
    u %= 1
    println(u)

    println("--------------------")

    /* *** Logical operators *** */
    println("Logical AND : ${x>z && z>y}")
    println("Logical OR : ${x<z || z>y}")

    val empty =true
    val full = false
    println("Logical NOT : empty-${!empty} full-${!full}")


}
*/

//Strings:
fun main(args: Array<String>) {
    val firstname ="Tejesh"
    print(firstname)

    val lastname:String
    lastname = " Gavas"
    println(lastname)

    println("--------------------")

    /* *** Access a String *** */
    var txt = "Hello World"
    println(txt[0])                // first element (H)
    println(txt[2])                // third element (l)

    println("--------------------")

    /* *** String Length *** */
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    println("The length of the txt string is: ${alphabet.length}")

    println("--------------------")

    /* *** String Functions *** */
    val name = "SPriNger NaTurE"
    println(name.toUpperCase())
    println(name.toLowerCase())

    println("--------------------")

    /* *** Comparing String *** */
    val a1 = "Hello World"
    val a2 = "Hello World"
    println(a1.compareTo(a2))        //compareTo(string)

    println("--------------------")

    /* *** Finding a String in a String  *** */
    val message = "Please see where 'kotlin' occurs!"  //Quotes inside a String use single quotes (')
    println(message.indexOf("kotlin"))

    println("--------------------")

    /* *** String Concatenation *** */
    val txt1 = "Welcome To SNTPS."
    val txt2 = "Welcome To Oasis."
    println(txt1 + " " + txt2)
    println(txt1.plus (txt2))   //we can also use plus() function to concatenate two Strings.

    println("--------------------")

    /* *** String Templates *** */
    println("Myself ${firstname}${lastname}")  //just refer to the variable with $ symbol
}
