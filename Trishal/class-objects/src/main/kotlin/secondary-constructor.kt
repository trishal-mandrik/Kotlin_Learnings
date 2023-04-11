fun main(args: Array<String>) {
    var dog = TheDog("Black", "Pug")
}

open class TheAnimal {   //super class
    var color: String = ""

    constructor(color: String) {
        this.color = color
        println("From Animal: $color")
    }
}

class TheDog : TheAnimal {
    var breed: String = ""

    constructor(color: String, breed: String) : super(color) {
        this.breed = breed

        println("From Dog: $color ans $breed")
    }
}