package creational_patterns.prototype_pattern

class Rectangle(private var width: Double, private var height: Double) : Shape  {

    fun getDimensions () : Pair<Double , Double> = Pair(width , height)
    fun updateDimensions(width: Double , height: Double) = apply {
        this.width = width
        this.height = height
    }

    override fun draw(): Shape {
        println("Drawing Rectangle with height = $height and width = $width")
        return this
    }

    override fun clone(): Shape = Rectangle(width, height)

}