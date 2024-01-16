package behavioral_patterns.observer_pattern.youtube_example

interface Subject {
    val observers : MutableList<Observer>
    fun attach(observer : Observer)
    fun detach(observer : Observer)
    fun notifyObservers()
}