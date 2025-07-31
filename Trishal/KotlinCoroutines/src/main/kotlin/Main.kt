import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() {
    val time = measureTimeMillis {
        runBlocking {
            println("Weather Forecast")

            val forecast: Deferred<String> = async {
                getForecast()
            }

            val temperature: Deferred<String> = async {
                getTemperature()
            }

            println("Fetching data...")
            println("Forecast: ${forecast.await()}")
            println("Temperature: ${temperature.await()}")

            println("Connection closed!")
        }
    }
    println("Execution time: ${time / 1000}s")
}

suspend fun getForecast(): String {
    delay(2000)
    return "Sunny"
}

suspend fun getTemperature(): String {
    delay(2000)
    return "25°C"
}