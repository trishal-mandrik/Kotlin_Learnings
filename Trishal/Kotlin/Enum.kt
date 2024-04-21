enum class CreditCardType(val color: String) {
    // enum constants
    SILVER("gray"),
    GOLD("gold"),
    PLATINUM("black")
}

fun main() {
    val value: CreditCardType = CreditCardType.GOLD

    println(value)
    println(CreditCardType.GOLD.ordinal)
    println(CreditCardType.GOLD.name)

    val myConstants: Array<CreditCardType> = CreditCardType.values()
    myConstants.forEach { println(it) }

    
}