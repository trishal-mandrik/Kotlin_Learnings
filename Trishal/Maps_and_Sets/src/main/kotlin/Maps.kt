fun main() {
    var yearOfBirth = mapOf(
        "Anna" to 1990,
        "Brian" to 1991,
        "Craig" to 1992,
        "Donna" to 1993
    )
    var namesAndScores = mapOf(
        "Anna" to 2,
        "Brian" to 2,
        "Craig" to 8,
        "Donna" to 6
    )
    println(namesAndScores)

    var pairs = HashMap<String, Int>() //empty map
    pairs = HashMap<String, Int>(20) //empty map with initial capacity 20

    namesAndScores = mutableMapOf(
        "Anna" to 2,
        "Brian" to 2,
        "Craig" to 8,
        "Donna" to 6
    )

    println(namesAndScores["Anna"])
    println(namesAndScores["Greg"])
    println(namesAndScores.get("Craig"))
    println(namesAndScores.isEmpty())
    println(namesAndScores.size)

    val bobData = mutableMapOf(
        "name" to "Bob",
        "profession" to "CardPlayer",
        "country" to "USA"
    )


    bobData.put("state", "CA")
    bobData["city"] = "San Francisco"
    println(bobData)

    bobData.put("name", "Bobby")
    bobData["profession"] = "Mailman"

    val pair = "nickname" to "Bobby D"
    bobData += pair
    println(bobData)

    //iterating through maps
    for((player, score) in namesAndScores){
        println("$player - $score")
    }

    for (player in namesAndScores.keys) {
        print("$player, ")
    }
    println()

    //hashcode
    println("some string".hashCode())

    println(1.hashCode())

    println(false.hashCode())
}
