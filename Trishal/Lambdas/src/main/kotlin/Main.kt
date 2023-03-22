import java.lang.NullPointerException

//Lambda is used to break up code into reusable chunks
//Generally used when dealing with collections such as an array or map

// REFER THE KOTLIN APPRENTICE BOOK FOR LAMBDAS

fun main() {

    var multiplyLambda: (Int, Int) -> Int //declaration

    multiplyLambda = {a: Int, b: Int -> Int
        a * b
    }

//    val multiplyLambda: (Int, Int) -> Int = { a: Int, b: Int -> Int
//        a * b
//    }



//    A lambda does not allow the use of names for arguments; for instance, you can’t write multiplyLambda(a = 4, b = 2). Unlike functions, you can’t use the parameter names for labeling the arguments.

    //ShortHand Syntax
    //using Kotlin’s type inference to shorten the syntax by removing the type information

//    multiplyLambda = {a,b ->
//        a * b
//    }

    val lambdaResult = multiplyLambda(4,3)
    println(lambdaResult)

    // it keyword
    // For a lambda that has only one parameter, we can shorten it even further using the it keyword.

    var doubleLambda = {a:Int ->
        2 * a
    }

    //Since there is only one parameter and the lambda type is now specified, the lambda can be shortened to:

    doubleLambda = { 2 * it }

    //New declaration
    val sqaure: (Int) -> Int = {it * it}

    operateOnNumbers(2, 18, multiplyLambda)
    operateOnNumbers(2, 18, operation = multiplyLambda) //can also write like this
    operateOnNumbers(2, 18, operation = ::addFunction) // can also pass normal func as parameter using ::(reference operator)

    var unitLambda : () -> Unit = {
        println("Kotlin Apprentice is awesome!")
    }
    unitLambda()

    var nothingLambda: () -> Nothing = {
        throw NullPointerException()
    }
//    nothingLambda()

    val values = listOf(1,2,3,4,5,6)
    values.forEach {
        println("$it: ${it * it}")
    }
}

fun operateOnNumbers(
    a: Int,
    b: Int,
    operation: (Int, Int) -> Int
) : Int {
    val result = operation(a, b)
    println(result)
    return result
}

fun addFunction(a: Int, b: Int): Int {
    return a + b
}