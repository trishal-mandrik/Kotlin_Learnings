fun main(){
    val names = setOf("Anna", "Brian", "Craig", "Anna")
    println(names)

    val hashSet = HashSet<Int>()
    val someArray = arrayOf(1,2,3,1)

    var someSet = mutableSetOf(*someArray)
    println(someSet)

    println(someSet.contains(1))
    println(4 in  someSet)

    for (number in someSet){
        println(number)
    }

    someSet.add(5)
    println(someSet)

    val removedOne = someSet.remove(1)
    println(removedOne)

    println(someSet)
}