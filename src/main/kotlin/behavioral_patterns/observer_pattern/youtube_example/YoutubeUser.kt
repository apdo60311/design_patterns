package behavioral_patterns.observer_pattern.youtube_example

class YoutubeUser(private val userName : String) : Observer {
    override fun update(message: String) {
        println("Notification For $userName: $message")
    }

}