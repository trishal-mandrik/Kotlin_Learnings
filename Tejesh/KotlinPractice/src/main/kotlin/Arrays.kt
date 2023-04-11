fun main(args: Array<String>) {
    val fruits = arrayOf("Mango", "Grapes", "Banana", "Apple", "Oranges")
//    or
    val vegetable = arrayOf<String>("Tomato","Onion","Beans","Eggplant")

    println("${fruits.get(1)} and ${fruits.get(3)}")  //Element on that particular index
    println("${vegetable[0]} and ${vegetable[2]}")
    println("----------")
    println("size of array is ${fruits.size}")          //size of array
    println("size of array is ${vegetable.size}")
    println("----------")

    vegetable.set(3,"Carrot")           //set and get the element of an array
    println(vegetable.get(3))
    println("----------")

    for (item in vegetable){      //to print element in array

        println(item)
    }
    println("----------")



    for (items in fruits) {
        println(items)
    }
    println("----------")

    if ("Apple" in fruits) {                   //Check if an Element exist or not!
        println("Apple is there in an array")
    } else {
        println("Not Exist!!")
    }
}