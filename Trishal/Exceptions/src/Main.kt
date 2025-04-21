//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class SpaceCraft {
    private var isConnectionAvailable: Boolean = false
    private var isEngineInOrder: Boolean = false
    private var fuel: Int = 0
    var isInSpace: Boolean = false

    fun launch() {
        if (fuel < 5) {
            throw OutOfFuelException()
        }

        if (!isEngineInOrder) {
            throw BrokenEngineException()
        }

        if (!isConnectionAvailable) {
            throw SpaceToEarthConnectionFailedException()
        }

        sendMessageToEarth("Trying to launch...")
        fuel -= 5
        sendMessageToEarth("I'm in space!")
        sendMessageToEarth("I've found some extraterrestrials")
        isInSpace = true
    }

    fun sendMessageToEarth(message: String) {
        println("Spacecraft to Earth: $message")
    }

    fun refuel() {
        fuel += 5
        sendMessageToEarth("The fuel tank is filled.")
    }

    fun repairEngine() {
        isEngineInOrder = true
        sendMessageToEarth("The engine is in order.")
    }

    fun fixConnection() {
        isConnectionAvailable = true
        sendMessageToEarth("Hello Earth! Can you hear me?")
        sendMessageToEarth("Connection is established.")
    }
    fun land() {
        sendMessageToEarth("Landing...")
        isInSpace = false
    }
}

open class SpaceCraftException(message: String) : Exception(message)

object SpacePort {
    fun investigateSpace(spaceCraft: SpaceCraft) {
        try {
            spaceCraft.launch()
        } catch (exception: SpaceCraftException) {
            spaceCraft.sendMessageToEarth(exception.localizedMessage)
            when (exception) {
                is OutOfFuelException -> spaceCraft.refuel()
                is BrokenEngineException -> spaceCraft.repairEngine()
                is SpaceToEarthConnectionFailedException -> spaceCraft.fixConnection()
            }
        } finally {
            if (spaceCraft.isInSpace) {
                spaceCraft.land()
            } else {
                investigateSpace(spaceCraft)
            }
        }
    }

    fun testSetup(spaceCraft: SpaceCraft) {

    }
}

class OutOfFuelException : SpaceCraftException("Out of fuel. Can't take off")
class BrokenEngineException : SpaceCraftException("The engine is broken. Can't take off")
class SpaceToEarthConnectionFailedException : SpaceCraftException("No connection with Earth. Can't take off")

fun main() {
    val spaceCraft = SpaceCraft()
    SpacePort.investigateSpace(spaceCraft)
}