package behavioral_patterns.mediator_pattern.chat_exampe

class ChatUser(mediator: ChatMediator, name: String) : User(mediator, name) {
    override fun sendMessage(message: String) {
        mediator.sendMessage(this , message)
    }

    override fun receiveMessage(message: String) {
        println("Received a Message \n$message")
    }

}