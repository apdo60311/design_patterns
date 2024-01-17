package behavioral_patterns.mediator_pattern.chat_exampe

interface ChatMediator {
    fun sendMessage(user: User, message: String)
}