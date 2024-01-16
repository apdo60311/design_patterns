package structural_patterns.decorator_pattern

class BasicCoffee : Beverage {
    override fun getDescription(): String {
        return "Basic Coffee"
    }

    override fun price(): Double {
        return 10.0
    }
}