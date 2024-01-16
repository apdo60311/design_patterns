package behavioral_patterns.memento_pattern.shapes_example

interface Originator {
    fun save() : Memento
}