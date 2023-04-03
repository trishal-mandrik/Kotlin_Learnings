package com.coffeeapp.domain

import com.coffeeapp.interfaces.Menu

class CoffeeMenu :Menu{
      val listOfCoffee: MutableList<Coffee> = mutableListOf()

    init {
        val americanoHalf: Coffee = Coffee("Americano", 150.00, "Half")
        val americanoFull: Coffee = Coffee("Americano", 300.00, "Full")
        val cappuccinoHalf: Coffee = Coffee("Cappuccino", 150.00, "Half")
        val cappuccinoFull: Coffee = Coffee("Cappuccino", 300.00, "Full")
        val espressoHalf: Coffee = Coffee("Espresso", 150.00, "Half")
        val espressoFull: Coffee = Coffee("Espresso", 300.00, "Full")


        listOfCoffee.add(americanoHalf)
        listOfCoffee.add(americanoFull)
        listOfCoffee.add(cappuccinoHalf)
        listOfCoffee.add(cappuccinoFull)
        listOfCoffee.add(espressoHalf)
        listOfCoffee.add(espressoFull)

    }
    override fun printCoffeeList(){
        listOfCoffee.forEach{Coffee -> println("${Coffee.id} -> Coffee($Coffee)")}
    }


}