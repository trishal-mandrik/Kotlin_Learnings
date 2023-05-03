package com.coffeeapp.util

import com.coffeeapp.domain.Burger
import com.coffeeapp.domain.Coffee

class DbUtil {
    private val listOfCoffee: List<Coffee> =
        listOf(
            Coffee(1, "Americano", 100.00),
            Coffee(2, "Cappuccino", 200.00),
            Coffee(3, "Espresso", 300.00),
        )

    fun printCoffeeList() {
        listOfCoffee.forEach { Coffee -> println("${Coffee.id} -> $Coffee") }
    }

    fun getCoffeeById(id: Int): Coffee? {
        return listOfCoffee.find { id == it.id }
    }

    private val listOfBurger: List<Burger> =
        listOf(
            Burger(1, "Veggie burger", 100.00),
            Burger(2, "Bean burger", 200.00),
            Burger(3, "Cheeseburger", 300.00)
        )

    fun printBurgerList() {
        listOfBurger.forEach { Burger -> println("${Burger.id} -> $Burger") }
    }

    fun getBurgerById(id: Int): Burger? {
        return listOfBurger.find { id == it.id }
    }
}