//Swapping Two Numbers using temp variable

fun main(args: Array<String>) {
    var firstnumber = 45.8f
    var secondnumber = 88.88f
    println("**Before Swapping**")
    println("First Number: $firstnumber")
    println("Second Number: $secondnumber")

    val temp = firstnumber  //value of firstnumber is assigned to temp
    firstnumber = secondnumber      //value of second is assigned to first
    secondnumber = temp             //value of temp which contain value of first is assigned to second

    println("**After Swapping**")
    println("First Number: $firstnumber")
    println("Second Number: $secondnumber")
}

/*
//Swapping Two Numbers without using temp variable

fun main(args: Array<String>) {
    var firstnumber = 45.8f
    var secondnumber = 88.88f

    println("**Before Swapping**")
    println("First Number: $firstnumber")
    println("Second Number: $secondnumber")

    firstnumber  = firstnumber-secondnumber
    secondnumber = firstnumber+secondnumber
    firstnumber  = secondnumber-firstnumber


    println("**After Swapping**")
    println("First Number: $firstnumber")
    println("Second Number: $secondnumber")
}
*/