import java.util.Scanner
fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)

    print("Enter age of a person: ")
    val age:Int = sc.nextInt()

    if(age in 1..99){
        val result1 = if (age > 18) {
            "Adult"
        } else {
            "Minor"
        }
        println(result1)

        val result2 = if (age > 19) {
            "Adult"
        } else if (age > 12){
            "Teen"
        } else {
            "Minor"
        }
        println(result2)

        val result3 = if (age > 12) {
            if ( age in 12..20 ){
                "Teen"
            } else {
                "Adult"
            }
        } else {
            "Minor"
        }
        println(result3)
    } else {
        println("Please enter valid human age")
    }
}