package com.coffeeapp.domain

open class Menu {
    private val listOfCoffee: List<Coffee> = listOf(
        Coffee("Americano", 150.00, "Half"),
        Coffee("Americano", 300.00, "Full"),
        Coffee("Cappuccino", 150.00, "Half"),
        Coffee("Cappuccino", 300.00, "Full"),
        Coffee("Espresso", 150.00, "Half"),
        Coffee("Espresso", 300.00, "Full")
    )

    fun print() {
        listOfCoffee.forEach { Coffee -> println("${Coffee.id} -> $Coffee") }
    }

    fun getCoffeeById(id: Int): Coffee? {
        return listOfCoffee.find { id == it.id }
    }


}