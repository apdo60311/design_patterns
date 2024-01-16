package structural_patterns.decorator_pattern

class Whip(private val beverage: Beverage) : CondimentDecorator(beverage) {
    override fun getDescription(): String {
        return "${beverage.getDescription()}, Whip"
    }

    override fun price(): Double {
        return beverage.price() + 8
    }
}