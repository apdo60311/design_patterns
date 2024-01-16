package structural_patterns.decorator_pattern


class Milk(private val beverage: Beverage) : CondimentDecorator(beverage) {
    override fun getDescription(): String {
        return "${beverage.getDescription()}, Milk"
    }

    override fun price(): Double {
        return beverage.price() + 5
    }
}

