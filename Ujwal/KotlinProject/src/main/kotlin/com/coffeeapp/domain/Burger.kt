package com.coffeeapp.domain

class Burger(id: Int, name: String, price: Double = 0.0) : Item(id, name, price) {

    override fun toString(): String {
        return "Burger(${super.toString()})"
    }

}