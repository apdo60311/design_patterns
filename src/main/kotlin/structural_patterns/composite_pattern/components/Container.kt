package structural_patterns.composite_pattern.components

class Container : Component {
    private var components : MutableList<Component> = mutableListOf()

    fun addComponent(component: Component) : Container {
        components.add(component)
        return this
    }

    override fun getPrice(): Double {
        var totalPrice = 0.0
        for (component in components) {
            totalPrice += component.getPrice()
        }
        return totalPrice
    }
}