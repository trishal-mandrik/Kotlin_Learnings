package com.coffeeapp.main

import com.coffeeapp.domain.Coffee
import com.coffeeapp.domain.Order
import com.coffeeapp.util.DbUtil
import java.util.*

fun main(args: Array<String>) {

    var flag: Boolean = true
    val scanner: Scanner = Scanner(System.`in`)
    val menu: DbUtil = DbUtil()

    println("Enter your Name")
    val customerName: String = scanner.nextLine()

    println("Welcome $customerName")
    val order: Order = Order(customerName)


    WhileLoop@ while (flag) {

        println("Enter Your Choice")
        println(
            """
 1->Order Item
 2->Update Quantity
 3->Cancel Item
 4->Print Order Details
 5->Print Invoice
 6->Exit
       """.trimMargin()
        )

        when (scanner.nextInt()) {

            1 -> {
                println("Enter 1:Coffee 2:Burger")
                val choice: Int = scanner.nextInt()
                if (choice == 1 || choice == 2) {
                    when (choice) {

                        1 -> {
                            println("-----------------------Coffee List-------------------------")
                            menu.printCoffeeList()

                            println("Enter CoffeeId-->")
                            val coffeeId: Int = scanner.nextInt()

                            println("Enter Quantity")
                            val quantity
                                    : Int = scanner.nextInt()
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
                            println("-----------------------Burger List-------------------------")
                            menu.printBurgerList()
                            println("Enter BurgerId-->")
                            val burgerId: Int = scanner.nextInt()
                            println("Enter Quantity")
                            val quantity: Int = scanner.nextInt()
                            if (quantity < 1) {
                                println("Entered Quantity is less than 1")
                                continue@WhileLoop
                            }
                            menu.getBurgerById(burgerId)?.let { burger ->
                                order.orderBurger(burger, quantity)
                            } ?: continue@WhileLoop

                            println("Burger Added")
                        }

                    }
                } else
                    println("Enter Wrong Choice!!!!")
            }

            2 -> {
                println("Update Quantity")
                order.getOrderDetails()

                println("Enter Id to update ")
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

                println("Enter 1:Cancel Coffee 2:Cancel Burger")

                val ch: Int = scanner.nextInt()
                if (ch == 1 || ch == 2) {
                    when (ch) {

                        1 -> {
                            println("Enter Id To cancel Coffee")
                            val boolean: Boolean = menu.getCoffeeById(scanner.nextInt())?.let { order.cancelCoffee(it) } == true
                            if (boolean)
                                println("Coffee Removed")
                            else
                                println("Entered Wrong ID")

                            println("------------------------Order Details----------------------------")
                            order.getOrderDetails()
                        }
                        2 -> {
                            println("Enter Id To cancel Burger")
                            val boolean: Boolean = menu.getBurgerById(scanner.nextInt())?.let { order.cancelBurger(it) } == true
                            if (boolean)
                                println("Burger Removed")
                            else
                                println("Entered Wrong Id")

                            println("------------------------Order Details----------------------------")
                            order.getOrderDetails()
                        }
                    }
                } else
                    println("Enter Wrong Choice!!!!")
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
