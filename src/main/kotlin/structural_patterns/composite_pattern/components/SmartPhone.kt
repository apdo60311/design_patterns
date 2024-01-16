package structural_patterns.composite_pattern.components

class SmartPhone(override var name: String, override var weight: Double) : Component , Item {
    private var price: Double = 0.0
    fun setPrice(price : Double) : SmartPhone {
        this.price = price
        return this
    }
    override fun getPrice(): Double {
        return price;
    }
}