package behavioral_patterns.memento_pattern.game_example

// Caretaker
class GameSaves {
    private val savedGames = mutableMapOf<String, PlayerMemento>()

    fun saveGame(saveName: String, memento: PlayerMemento) {
        savedGames[saveName] = memento
    }

    fun loadGame(saveName: String): PlayerMemento? {
        return savedGames[saveName]
    }
}