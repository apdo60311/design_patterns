package behavioral_patterns.observer_pattern.youtube_example

class YoutubeChannel(private val channelName : String) : Subject {
    override val observers: MutableList<Observer> by lazy { mutableListOf() }

    override fun attach(observer: Observer) {
        observers.add(observer)
    }

    override fun detach(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        observers.forEach {
            it.update("new video Random name from $channelName")
        }
    }
}