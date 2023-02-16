fun main(){
    val innerPlanets = listOf("Mercury", "Venus", "Earth", "Mars")
    println(innerPlanets)
    val innerPlanetsArrayList = arrayListOf("Mercury", "Venus", "Earth", "Mars")

    val outerPlanets = mutableListOf("Jupiter", "Saturn", "Uranus", "Neptune")

    val exoPlanets = mutableListOf<String>()

    val players = mutableListOf<String>("Alice", "Bob", "Cindy", "Dan")

    println(players.isEmpty())

    if(players.size < 2){
        println("We need at least two players!")
    } else {
        println("Let's start")
    }

    var currentPlayer = players.last()
    println(currentPlayer)
    currentPlayer = players.first()
    println(currentPlayer)

    val minPlayer = players.minOrNull()
    minPlayer.let{
        println("$minPlayer will start")
    }

    val maxPlayer = players.maxOrNull()
    if(maxPlayer != null) {
        println("$maxPlayer is the MAX")
    }

    val upcomingPlayersSlice = players.slice(1..2)
    println(upcomingPlayersSlice.joinToString())

    players.add("Eli")
    players += "Gina"
//    players += "Kavi"
    println(players.joinToString())
    players.add(5, "Frank")
    println(players.joinToString())

    val wasPlayerRemoved = players.remove("Gina")
    println("It is $wasPlayerRemoved that Gina was removed")

    val removedPlayer = players.removeAt(2)
    println("$removedPlayer was removed")
    println(players.joinToString())
    println("Dan position is ${players.indexOf("Dan")}")

    players[4] = "Franklin"
    println(players.joinToString())

    players[3] = "Anna"
    players.sort()
    println(players.joinToString())

    val scores = listOf(2,2,8,6,1)

    for(player in players) {
        println(player)
    }

    for((index, player) in players.withIndex()) {
        println("${index + 1}. $player")
    }

    fun sumOfElements(list: List<Int>) :Int {
        var sum = 0
        for(number in list){
            sum += number
        }
        return sum
    }

    println(sumOfElements(scores))

    var nullable: List<Int>? = listOf(1,2,3,4)

    nullable = null

    var listOfNullables: List<Int?> = listOf(1,2,null, 4)

    var nullableListOfNullables: List<Int?>? = listOf(1,2,null,4)
    nullableListOfNullables = null;
}