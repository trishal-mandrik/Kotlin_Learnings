package com.coffeeapp.domain

data class Customer(val name: String, val phoneNumber: Long) {
    val id: Int = counter++

    companion object {
        var counter = 1;
    }
    override fun toString(): String {
        return "name=$name PhoneNo=$phoneNumber"
    }
}