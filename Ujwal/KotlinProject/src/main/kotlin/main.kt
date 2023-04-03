import com.coffeeapp.domain.CoffeeMenu
import com.coffeeapp.domain.Customer
import com.coffeeapp.interfaces.Menu
import com.coffeeapp.interfaces.PrintInstruction
import java.awt.SystemColor.menu
import java.util.*

fun main(args: Array<String>) {

    var flag: Boolean = true
    val scanner: Scanner = Scanner(System.`in`)
    val menu: CoffeeMenu = CoffeeMenu()


//    println("Hello , Enter Name and Phone NO")
//    val customer: Customer = Customer(scanner.nextLine(), scanner.nextLong())
//    println("Welcome $customer")

    while (flag) {


        val print: PrintDetails = PrintDetails()
        print.printInstruction()


        val choice: Int = scanner.nextInt()
        when (choice) {
            1 -> {
                println("Coffee List ")
                menu.printCoffeeList()
                println("Enter Coffee You Want to buy")
                val coffeeId:Int=scanner.nextInt()
                println("Enter Quantity")





            }
            2 -> {
                print("Update Quantity")

            }
            3 -> {
                print("cancel Ordder")
            }
            4 -> {
                print("Order Details")
            }
            5 -> {

            }
            6 -> flag = false

            else -> print("Invalid Choice !!!!")

        }
    }

}
