package structural_patterns.decorator_pattern

class Chocolate(private val beverage: Beverage) : CondimentDecorator(beverage) {
    override fun getDescription(): String {
        return "${beverage.getDescription()}, Chocolate"
    }

    override fun price(): Double {
        return beverage.price() + 0.0
    }
}