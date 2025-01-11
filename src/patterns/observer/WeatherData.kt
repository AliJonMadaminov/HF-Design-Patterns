package patterns.observer

class WeatherData: Observable {
    private var observers: ArrayList<Observer> = arrayListOf()
    var temperature: Float = 0f
        private set
    var humidity: Float = 0f
        private set
    var pressure: Float = 0f
        private set

    override fun registerObserver(o: Observer) {
        observers.add(o)
    }

    override fun unregisterObserver(o: Observer) {
        observers.remove(o)
    }

    override fun notifyObservers() {
        observers.forEach { observer ->
            observer.update()
        }
    }

    fun setMeasurements(
        temperature: Float,
        humidity: Float,
        pressure: Float,
    ) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        notifyObservers()
    }
}