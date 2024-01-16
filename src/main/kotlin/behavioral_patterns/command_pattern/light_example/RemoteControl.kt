package behavioral_patterns.command_pattern.light_example

import kotlin.properties.Delegates

class RemoteControl {
    private var command: Command? = null

    fun setCommand(command: Command) {
        this.command = command
    }

    fun pressButton() {
        command?.execute()
    }
}