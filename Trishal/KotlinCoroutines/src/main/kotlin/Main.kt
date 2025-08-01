import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() {
    val time = measureTimeMillis {
        runBlocking {
            println("Weather Forecast")
            println(getWeatherReport())
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

suspend fun getWeatherReport() = coroutineScope {
    val forecast = async { getForecast() }
    val temperature = async { getTemperature() }

    "Forecast: ${forecast.await()}, Temperature: ${temperature.await()}"
}