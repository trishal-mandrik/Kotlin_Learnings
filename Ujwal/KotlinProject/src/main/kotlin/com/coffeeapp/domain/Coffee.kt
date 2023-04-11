package com.coffeeapp.domain


data class Coffee(val name: String, val price: Double, val size: String) {
    val id: Int = counter++

    companion object {
        var counter = 1;
    }

    override fun toString(): String {
        return "$name(Size=$size Price=$price RS)"
    }
}