package behavioral_patterns.visitor_pattern.exporter_example

interface Visitor {
    fun visit(shape: Shape)
}

class XmlExportVisitor : Visitor {

    fun visitAll (shapes: List<Shape>) {
        shapes.forEach {
            it.accept(this);
        }
    }

    override fun visit(shape: Shape) {
        when (shape) {
            is Circle -> visitCircle()
            is Rectangle -> visitRectangle()
            is CompoundShape -> visitCompoundShape()
            is Dot -> visitDot()
        }
    }

    private fun visitDot() {
        println("Visiting Dot using XML EXPORT.....")
    }

    private fun visitCompoundShape() {
        println("Visiting Compound Shape using XML EXPORT.....")
    }

    private fun visitRectangle() {
        println("Visiting Rectangle using XML EXPORT.....")
    }

    private fun visitCircle() {
        println("Visiting Circle using XML EXPORT.....")
    }
}

interface Shape {
    fun draw()
    fun move(x : Double, y : Double)
    fun accept(visitor: Visitor)
}

class Dot : Shape {
    override fun draw() {
        println("Drawing Dot")
    }

    override fun move(x: Double, y: Double) {
        println("Moving.... coordinates = ($x , $y)")
    }

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}
class Circle : Shape {
    override fun draw() {
        println("Drawing Circle")
    }

    override fun move(x: Double, y: Double) {
        println("Moving.... coordinates = ($x , $y)")
    }

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}
class Rectangle : Shape {
    override fun draw() {
        println("Drawing Rectangle")
    }

    override fun move(x: Double, y: Double) {
        println("Moving.... coordinates = ($x , $y)")
    }

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}
class CompoundShape : Shape {
    override fun draw() {
        println("Drawing CompoundShape")
    }

    override fun move(x: Double, y: Double) {
        println("Moving.... coordinates = ($x , $y)")
    }

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}