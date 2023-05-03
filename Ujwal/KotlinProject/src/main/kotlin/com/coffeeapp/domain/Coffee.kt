package com.coffeeapp.domain


class Coffee(id: Int, name: String, price: Double = 0.0) : Item(id, name, price) {
    override fun toString(): String {
        return "Coffee(${super.toString()})"
    }
}