package creational_patterns.prototype_pattern

import kotlin.properties.Delegates

class Circle(private var radius: Double) : Shape {

    fun getRadius () : Double = radius
    fun upDateRadius(radius: Double) = radius.also { this.radius = it }

    override fun draw(): Shape {
        println("Drawing Circle with radius = $radius")
        return this
    }

    override fun clone(): Shape {
        return  Circle(radius)
    }
}