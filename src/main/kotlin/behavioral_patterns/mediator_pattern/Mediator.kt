package behavioral_patterns.mediator_pattern


interface Mediator {
    fun addColleague(colleague: Colleague)
    fun sendMessage(message: String, colleague: Colleague)
}


interface Colleague {
    fun sendMessage(message: String)
    fun receiveMessage(message: String)
}


class ConcreteMediator : Mediator {
    private val colleagues: MutableList<Colleague> = mutableListOf()

    override fun addColleague(colleague: Colleague) {
        colleagues.add(colleague)
    }

    override fun sendMessage(message: String, colleague: Colleague) {
        for (c in colleagues) {
            if (c != colleague) {
                c.receiveMessage(message)
            }
        }
    }
}


class ConcreteColleague(private val mediator: Mediator, private val name: String) : Colleague {
    init {
        mediator.addColleague(this)
    }

    override fun sendMessage(message: String) {
        println("$name sends message: $message")
        mediator.sendMessage(message, this)
    }

    override fun receiveMessage(message: String) {
        println("$name receives message: $message")
    }
}
