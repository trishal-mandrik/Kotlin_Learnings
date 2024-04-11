fun main() {
    var user1 = User("Sam", 10)
    var user2 = User("Sam", 10)

    print(user1)

    var newUser = user1.copy(id = 10)
    println(newUser)

    println(newUser == user1)
}

data class User(var name: String, var id: Int)