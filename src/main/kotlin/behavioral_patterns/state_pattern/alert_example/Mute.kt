package behavioral_patterns.state_pattern.alert_example

class Mute : MobileAlertState {
    override fun alert() {
        println("No Sound .....")
    }
}