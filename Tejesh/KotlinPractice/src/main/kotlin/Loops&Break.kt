//While Loop:
fun main(args: Array<String>) {
    var i = 0
    while (i <= 5) {
        println(i)
        i++
    }
    println("--------------")

//Do.. While Loop:
    var j = 5
    do {
        println(j)
        j--
    }
    while (j >= 0 )

    println("--------------")

    //For Loop:
    val cars = arrayOf("Mercedes", "BMW", "Audi", "Porsche")  //array of Strings
    for (x in cars) {
        println(x)
    }

    println("--------------")

    val num = arrayOf(5,10,15,20)  //array of Integer
    for (x in num) {
        println(x)
    }
    println("--------------")

//Break Statement:
    var a = 0
    while (a < 10) {
        println(a)
        ++a
        if (a == 4) {
            break
        }
    }

    println("--------------")

//Continue Statement:
    var b = 0
    while (b < 10) {
        if (b == 4) {
            b++
            continue
        }
        println(b)
        b++
    }

}