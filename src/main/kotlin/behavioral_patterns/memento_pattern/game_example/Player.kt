package behavioral_patterns.memento_pattern.game_example

// originator
data class Player(var level: Int, var health: Int, var experience: Int) {
    fun save(): PlayerMemento {
        return PlayerMemento(level, health, experience)
    }

    fun restore(memento: PlayerMemento) {
        level = memento.level
        health = memento.health
        experience = memento.experience
    }

    fun displayPlayerInfo() {
        println("Player info - Level: $level, Health: $health, Experience: $experience")
    }
}


