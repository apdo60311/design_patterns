package behavioral_patterns.state_pattern.alert_example

class Sound : MobileAlertState {
    override fun alert() {
        println("Sound is working .....")
    }
}