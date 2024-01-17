package behavioral_patterns.mediator_pattern.chat_exampe

class ConcreteChatMediator : ChatMediator {
    private val users : MutableList<User> = mutableListOf()

    fun addUser(user: User) : ChatMediator {
        users.add(user)
        return this
    }

    override fun sendMessage(user: User, message: String) {
        users.forEach {
            if (user != it) {
                it.receiveMessage(message)
            }
        }
    }

}