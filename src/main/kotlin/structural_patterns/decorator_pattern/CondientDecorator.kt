package structural_patterns.decorator_pattern

abstract class CondimentDecorator(private val beverage: Beverage) : Beverage {
    override fun getDescription(): String {
        return beverage.getDescription()
    }

    override fun price(): Double {
        return beverage.price()
    }
}