package structural_patterns.composite_pattern.components

class Laptop(var name: String, var weight: Double) : Component  {

    private var price: Double = 0.0

    fun setPrice(price : Double) : Laptop {
        this.price = price
        return this
    }
    override fun getPrice(): Double {
        return price
    }
}