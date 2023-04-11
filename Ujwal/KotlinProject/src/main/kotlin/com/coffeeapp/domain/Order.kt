package com.coffeeapp.domain

class Order(val customerName: String) {

    private val mapOfOrders: MutableMap<Coffee, Int> = mutableMapOf()

    fun orderCoffee(coffee: Coffee, quantity: Int) {
        if (quantity > 0)
            mapOfOrders[coffee] = quantity
        else
            println("Something Went Wrong!!! ")


    }

    fun updateQuantity(coffee: Coffee, quantityUpdate: Int) {
        if (quantityUpdate > 0)
            mapOfOrders[coffee] = quantityUpdate

    }

    fun getOrderDetails() {
        mapOfOrders.forEach { (c, q) ->
            println("ID=${c.id} | $c | Quantity=$q")
        }
    }

    fun cancelCoffee(coffee: Coffee): Boolean {
        return if (mapOfOrders.contains(coffee)) {
            mapOfOrders.remove(coffee)
            true
        } else
            false
    }

    fun printInvoice(customerName: String) {
        println("Name = $customerName")
        println("------------------------Coffee Ordered---------------------------")
        getOrderDetails()
        println("-----------------------------------------------------------------")
        val totalAmount = mapOfOrders.map { (coffee, quantity) ->
            coffee.price * quantity
        }.sum()
        println("Total Amount=$totalAmount RS     |      Reward Points=${(totalAmount / 150).toInt()}")
        println("      150 RS order purchase = 1 Reward Point")
    }


}