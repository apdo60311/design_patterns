package behavioral_patterns.memento_pattern.shapes_example

interface Memento {
    fun restore() : Originator
    fun getState() : String
}
