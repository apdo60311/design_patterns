package behavioral_patterns.memento_pattern.shapes_example

data class Shape(val id: String, var x: Int, var y: Int, val type: String) : Originator {
    fun move(newX: Int, newY: Int) {
        x = newX
        y = newY
    }
    fun clone(): Shape {
        return this.copy()
    }
    override fun save(): Memento {
        return ShapeMemento(clone())
    }

    override fun toString(): String {
        return "Shape(id='$id', x=$x, y=$y, type='$type')"
    }
}

class ShapeMemento(private val state: Shape) : Memento {
    override fun restore(): Originator {
        return state.clone()
    }

    override fun getState(): String {
        return "[${state.id}] ${state.type} At (${state.x},${state.y})"
    }

}


class DrawingTracker {
    private val savedStates = mutableListOf<Memento>()

    fun addMemento(memento: Memento) {
        savedStates.add(memento)
    }

    fun getMemento(index: Int): Memento {
        return savedStates[index]
    }

    fun undo() {
        savedStates.removeAt(savedStates.size - 1)
    }

    fun showHistory() {
        for (memento in savedStates) {
            println("${memento.getState()} Drawn")
        }
    }
}