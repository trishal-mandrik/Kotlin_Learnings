fun main() {
    val direction: Direction = Direction.SOUTH

    println(direction.name)
    println(direction.ordinal)

    val parsedDirection = Direction.valueOf("EAST")
    println(parsedDirection.name)

    val apiValue = Direction.values()[2]
    println(apiValue)

    val color = HighlightColor.BLUE
    println(color.value)
}