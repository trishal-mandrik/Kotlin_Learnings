import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() {
    val time = measureTimeMillis {
        runBlocking {
            println("Weather App is running!")

            launch {
                printForecast()
            }

            launch {
                printTemperature()
            }

            println("Connection closed!")
        }
    }
    println("Execution time: ${time / 1000}s")
}

suspend fun printForecast() {
    delay(2000)
    println("Forecast: Sunny for the next 5 days")
}

suspend fun printTemperature() {
    delay(2000)
    println("Current Temperature: 25°C")
}