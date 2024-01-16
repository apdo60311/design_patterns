package behavioral_patterns.state_pattern.alert_example

class AlertStateContext {
    private var state : MobileAlertState = Vibration();

    fun setState(newState : MobileAlertState) {
        this.state = newState
    }

    fun alert() {
        state.alert()
    }
}