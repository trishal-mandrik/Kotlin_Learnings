//------------------------------------DATA CLASS----------------------------------

fun main() {
    var user1 = User("Sam", 10)
    var user2 = User("Sam", 10)

    println(user1)

    if(user1 == user2)
        println("Equal")
    else
        print("Not equal")

    var newUser1 = user1.copy(id = 25, name = "Trishal")
    var newUser2 = user1.copy(id = 25)
    println(newUser1)
    println(newUser2)
}

data class User(var name: String, var id: Int)