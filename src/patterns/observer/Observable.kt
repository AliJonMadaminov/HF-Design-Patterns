package patterns.observer

interface Observable {
    fun registerObserver(o: Observer)
    fun unregisterObserver(o: Observer)
    fun notifyObservers()
}