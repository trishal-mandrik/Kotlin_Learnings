enum class CreditCardType {
    SILVER,  //ordinal = 0  name = "SILVER"
    GOLD,    //ordinal = 1  name = "GOLD"
    PLATINUM //ordinal = 2  name = "PLATINUM"
}

fun main(args: Array<String>) {
//    Enum constants are objects of enum class type
    val peterCarType: CreditCardType = CreditCardType.GOLD
    println(peterCarType)

//    each enum object has two properties: ordinal and name
    println(CreditCardType.GOLD.ordinal)
    println(CreditCardType.GOLD) // OR CreditCardType.GOLD.name

//    Each enum object has two methods: values() and valueOf
    val myConstants: Array<CreditCardType> = CreditCardType.values()
    myConstants.forEach { println(it) }

//    using in 'when' statement
    when(peterCarType){
        CreditCardType.SILVER -> println("Peter has silver card")
        CreditCardType.GOLD -> println("Peter has gold card")
        CreditCardType.PLATINUM -> println("Peter has platinum card")
    }
}