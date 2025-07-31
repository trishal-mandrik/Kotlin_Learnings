import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() {
    val time = measureTimeMillis {
        runBlocking {
            println("Weather App is running!")
            delay(1000)
            println("Sunny, 25°C")
            printForecast()
            printTemperature()
        }
    }
    println("Execution time: $time ms")
}

suspend fun printForecast() {
    delay(1000)
    println("Forecast: Sunny for the next 5 days")
}

suspend fun printTemperature() {
    delay(1000)
    println("Current Temperature: 25°C")
}