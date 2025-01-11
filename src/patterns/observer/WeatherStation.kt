package patterns.observer

import patterns.observer.display.CurrentConditionsDisplay
import patterns.observer.display.HeatIndexDisplay

fun main() {
    val weatherData = WeatherData()
    val currentConditionsDisplay = CurrentConditionsDisplay(weatherData)
    val heatIndexDisplay = HeatIndexDisplay(weatherData)

    weatherData.setMeasurements(
        temperature = 50f,
        humidity = 50f,
        pressure = 50f
    )
    weatherData.setMeasurements(
        temperature = 40f,
        humidity = 40f,
        pressure = 40f
    )
}