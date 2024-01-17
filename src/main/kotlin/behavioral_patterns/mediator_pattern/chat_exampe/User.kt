package behavioral_patterns.mediator_pattern.chat_exampe

abstract class User(val mediator: ChatMediator, val name: String) {
    abstract fun sendMessage(message: String)
    abstract fun receiveMessage(message: String)
}


