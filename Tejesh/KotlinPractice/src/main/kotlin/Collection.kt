/* +------+-------------+--------------------+
   |      |  Immutable  |      Mutable       |
   +------+-------------+--------------------+
   | LIST | listOf<T>() | mutableListOf<T>() |
   | SET  | setOf<T>(   | mutableSetOf<T>()  |
   | MAP  | mapOf<K,V>()| mutableMapOf<K,V>()|
   +------+----------------------------------+
*/
//***LISTS***
fun main() {
    //Immutable List
   val num = listOf<Int>(1,2,3)  //listOf is a Method to create List
    println(num.indexOf(3))
    println(num.contains(5))
    println(num.size)
 println("______________")

    //MutableList
    val nums = mutableListOf<Int>(1,2,3,4)
    nums [1]=1
    nums.add(5)
    nums.remove(4)
    println(nums)

    //Merge Two List
    val list2 = mutableListOf<Int>(11,12,13)
    nums.addAll(list2)
    println(nums)
 println("______________")

    val numbers = listOf<String>("one","two","three","four")
    val indices = numbers.indices      //returns IntRange object with valid indices for this List
    println(indices)
 println("______________")

    //using For Loop
    for (i in numbers.indices){
        println(numbers[i])
    }
 println("______________")

    for (i in numbers.withIndex()){
     println(i)
    }
 println("______________")

 val List1 = listOf<Any>(1,'A',"one")
 for (i in List1){
  println(i)
 }
    println("List1.size = ${List1.size}")
 val emptyList2 = emptyList<Any>() //Empty List
 println("emptyList2.size = ${emptyList2.size}")

    val a = emptyList<String>()
    val b = emptyList<Int>()
    val result= a===b
    println(result)
   println("____SETS____")

// *****SETS*****
    val v= mutableSetOf<Int>(1,2,2,3,2,3,4,5)
    println(v)
    v.forEach { println(it) }

    println("______________")

    //Mutable Set
   val x = mutableSetOf<Int>(22,28,24,21,19)
    x.add(27)
    v.addAll(x)
    println(x)
    println(v)
    println("______________")

//    ***MAPS***
    val employees = mapOf<Int,String>(1 to "Udit", 2 to "Ujwal", 3 to "Rushikesh")
    employees.forEach { println(it)}
    println(employees[2])
    println("______________")

    //Creating Map using HashMap
    val names = HashMap<Int,String>()
    names[1] = "Abc"
    names[2] = "Pqr"
    names[3] = "Xyz"
    println(names)
    println("______________")

    //Sorting Map Elements
    var Digits = mapOf<Int,String>(3 to "three",4 to "four",1 to "one",2 to "two")
    var output = Digits.toSortedMap()  //toSortedMap() method to sort in ascending order.
    println(output)


}


