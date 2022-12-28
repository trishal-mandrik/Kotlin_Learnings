fun main(){
    val innerPlanets = listOf("Mercury", "Venus", "Earth", "Mars")
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
    players += "Kavi"
    println(players.joinToString())
    
}