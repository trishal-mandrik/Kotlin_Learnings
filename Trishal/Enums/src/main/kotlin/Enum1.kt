interface ICardCashBack {
    fun getCashbackValue(): Float
}

enum class CreditCardType1(val color: String, val maxlimit: Int = 100000): ICardCashBack {
    SILVER("gray", 50000) {
        override fun getCashbackValue() : Float = 0.02f
    },
    GOLD("gold") {
        override fun getCashbackValue(): Float = 0.04f
    },
    PLATINUM("black"){
        override fun getCashbackValue(): Float = 0.06f
    }
}

fun main() {
//    Access properties and methods
    println(CreditCardType1.SILVER.color) //gray
    println(CreditCardType1.SILVER.getCashbackValue()) //0.02

    /*Enum constants are objects of enum class type. */
    val peterCardType: CreditCardType1 = CreditCardType1.GOLD


    /* Each enum object has two properties: ordinal and name */
    println(CreditCardType.GOLD.ordinal)
    println(CreditCardType1.GOLD)

    
}