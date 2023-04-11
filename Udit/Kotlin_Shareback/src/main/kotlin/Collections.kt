import kotlin.system.exitProcess

/*
*   Map
*/

fun main(args: Array<String>)
{
    val theReadOnlyMap = mapOf<Int, String>(1 to "One", 2 to "Two", 3 to "Three", 4 to "Four")
    println("Map Entries: $theReadOnlyMap")
    println("Map Keys: "+theReadOnlyMap.keys)
    println("Map Values: "+theReadOnlyMap.values)

    val ranks = mapOf<Int, String>(1 to "India",2 to "Australia",3 to "England",4 to "Africa")
    println("The size of the map is: "+ranks.size)
    println("The size of the map is: "+ranks.count())

    val numbersMap = mutableMapOf<String, Int>("one" to 1, "two" to 2)
    numbersMap.put("three", 3)
    numbersMap["one"] = 11
    println(numbersMap)
    numbersMap.remove("three") // OR numbersMap.remove("three", 3)
    println(numbersMap)

    val map1 = mapOf<String, Int>("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
    var map2 = mapOf<String, Int>("key2" to 2, "key1" to 1, "key4" to 1, "key3" to 3)
    val map3 = mapOf<String, Int>("key2" to 2, "key1" to 1, "key4" to 1, "key3" to 3)
    var map4 = map2

    println("The maps are equal: ${map1 == map2}")
    println("The maps are equal: ${map2 === map3}")
    println("The maps are equal: ${map2 === map4}")

    println("-------------------------------------------------------------------------------------------")

    val theMap1 = HashMap<String, Int>()
    theMap1["one"] = 1
    theMap1["two"] = 2
    theMap1["three"] = 3
    theMap1["four"] = 4
    println(theMap1)

    val theMap2 = HashMap<Int, String>()
    theMap2[1] = "One"
    theMap2[2] = "Two"
    theMap2[3] = "Three"
    theMap2[4] = "Four"
    println(theMap2)

    println("-------------------------------------------------------------------------------------------")

    val theMap = mapOf(Pair("one", 1), Pair("two", 2), Pair(4, "four"), Pair("three", 3))
    println(theMap)
    println(theMap.entries)

}