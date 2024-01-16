package creational_patterns.prototype_pattern

interface Shape {
    fun draw() : Shape
    fun clone() : Shape
}