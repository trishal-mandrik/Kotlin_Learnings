package com.coffeeapp.main

import com.coffeeapp.domain.Coffee
import com.coffeeapp.domain.Menu
import com.coffeeapp.domain.Order
import java.util.*

fun main(args: Array<String>) {

    var flag: Boolean = true
    val scanner: Scanner = Scanner(System.`in`)
    val menu: Menu = Menu()

    println("Enter your Name")
    val customerName: String = scanner.nextLine()

    println("Welcome $customerName")
    val order: Order = Order(customerName)


    WhileLoop@ while (flag) {

        println("Enter Your Choice")
        println(
            """
 1->Order Coffee
 2->Update Quantity
 3->Cancel Coffee
 4->Print Order Details
 5->Print Invoice
 6->Exit
       """.trimMargin()
        )

        when (scanner.nextInt()) {
            1 -> {
                println("-----------------------Coffee List-------------------------")
                menu.print()

                println("Enter Coffee You Want to buy with ID-->")
                val coffeeId: Int = scanner.nextInt()

                println("Enter Quantity")
                val quantity: Int = scanner.nextInt()
                if (quantity < 1) {
                    println("Entered Quantity is less than 1")
                    continue@WhileLoop
                }
                menu.getCoffeeById(coffeeId)?.let { coffee ->
                    order.orderCoffee(coffee, quantity)
                } ?: continue@WhileLoop

                println("Coffee Added")

            }
            2 -> {
                println("Update Quantity")
                order.getOrderDetails()

                println("Enter CoffeeId to update ")
                val coffeeId: Int = scanner.nextInt()
                val coffee: Coffee? = menu.getCoffeeById(coffeeId)
                println("Quantity to update")
                val quantityUpdate: Int = scanner.nextInt()
                if (coffee != null) {
                    order.updateQuantity(coffee, quantityUpdate)
                }
                order.getOrderDetails()

            }
            3 -> {
                println("-------------------------Order Details---------------------------")
                order.getOrderDetails()

                println("Enter CoffeeId To cancel Coffee")
                val boolean: Boolean = menu.getCoffeeById(scanner.nextInt())?.let { order.cancelCoffee(it) } == true
                if (boolean)
                    println("Coffee Removed")
                else
                    println("Entered Wrong coffeeId")

                println("------------------------Order Details----------------------------")
                order.getOrderDetails()
            }
            4 -> {
                println("-----------------------Order Details----------------------------")
                order.getOrderDetails()


            }
            5 -> {
                println("-----------------------------Invoice-----------------------------")
                order.printInvoice(customerName)
                break
            }
            6 -> flag = false

            else -> println("Entered Invalid Choice !!!!")

        }
    }

}
