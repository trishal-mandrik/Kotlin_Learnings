package com.coffeeapp.domain

class Order(val customerName: String) {

    private val mapOfOrders: MutableMap<Item, Int> = mutableMapOf()

    fun orderCoffee(coffee: Coffee, quantity: Int) {
        if (quantity > 0)
            mapOfOrders[coffee] = quantity
        else
            println("Something Went Wrong!!! ")


    }

    fun orderBurger(burger: Burger, quantity: Int) {
        if (quantity > 0)
            mapOfOrders[burger] = quantity
        else
            println("Something Went Wrong!!! ")


    }


    fun updateQuantity(item: Item, quantityUpdate: Int) {
        if (quantityUpdate > 0)
            mapOfOrders[item] = quantityUpdate

    }

    fun getOrderDetails() {
        if (mapOfOrders.isEmpty())
            println("No orders Yet")
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

    fun cancelBurger(burger: Burger): Boolean {
        return if (mapOfOrders.contains(burger)) {
            mapOfOrders.remove(burger)
            true
        } else
            false
    }


    fun printInvoice(customerName: String) {
        println("Name = $customerName")
        println("------------------------Order Details---------------------------")
        getOrderDetails()
        println("-----------------------------------------------------------------")
        val totalAmount = mapOfOrders.map { (Item, quantity) ->
            Item.price * quantity
        }.sum()
        println("Total Amount=$totalAmount RS     |      Reward Points=${(totalAmount / 150).toInt()}")
        println("        150 RS order purchase = 1 Reward Point")
    }


}