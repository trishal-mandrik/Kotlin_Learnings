import com.coffeeapp.interfaces.PrintInstruction


class PrintDetails() : PrintInstruction {
    override fun printInstruction() {
        println("Enter Your Choice")
        println("""
 1->Order Coffee
 2->Update Quantity
 3->Cancel Coffee
 4->Print Order Details
 5->Print Invoice
 6->Exit
       """.trimMargin()
        )
    }




}