package patterns.observer.display

import patterns.observer.Observer
import patterns.observer.Observable
import patterns.observer.WeatherData

class CurrentConditionsDisplay(
    private var observable: Observable
) : Observer, DisplayElement {
    private var temperature: Float = 0f
    private var humidity: Float = 0f
    private var pressure: Float = 0f

    init {
        observable.registerObserver(this)
    }

    override fun update() {
        (observable as? WeatherData)?.let { weatherData ->
            temperature = weatherData.temperature
            humidity = weatherData.humidity
            pressure = weatherData.pressure
            display()
        }
    }

    override fun display() {
        println("temperature: $temperature, humidity: $humidity, pressure: $pressure")
    }
}