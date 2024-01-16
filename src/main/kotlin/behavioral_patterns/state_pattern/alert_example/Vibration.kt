package behavioral_patterns.state_pattern.alert_example

class Vibration : MobileAlertState {
    override fun alert() {
        println("Vibrating.....")
    }
}