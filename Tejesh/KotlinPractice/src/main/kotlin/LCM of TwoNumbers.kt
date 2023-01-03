import java.util.Scanner

//Program to Calculate LCM using while loop & if statement
fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)
    print("Enter Number1: ")
    var num1 = reader.nextInt()
    print("Enter Number2: ")
    var num2 = reader.nextInt()
    var lcm : Int

    // maximum number between num1 & num2 is stored in lcm
    lcm = if (num1 > num2) num1 else num2

    //Always true
    while (true){
        if (lcm % num1 == 0 && lcm % num2 == 0){
            println("The LCM of $num1 and $num2 is $lcm. ")
            break
        }
        ++lcm
    }
}
