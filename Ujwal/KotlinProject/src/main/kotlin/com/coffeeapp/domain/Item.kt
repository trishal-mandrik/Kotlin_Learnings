package com.coffeeapp.domain

open class Item(val id: Int, private val name: String, val price: Double) {
    override fun toString(): String {
        return "Name=$name Price=$price"
    }
}