package structural_patterns.composite_pattern

import structural_patterns.composite_pattern.components.Component
import java.sql.Time
import java.time.Instant
import kotlin.random.Random

class Order {
    private var orderId : String = Random.nextInt().toString()
    private var orderDate : String = Time.from(Instant.now()).toString()
    private var items : MutableList<Component> = mutableListOf()

    fun addItem(component: Component) : Order {
        items.add(component)
        return this;
    }

    fun getTotalPrice() : Double {
        var totalPrice : Double = 0.0

        for (item in items) {
            totalPrice += item.getPrice()
        }

        return totalPrice
    }
}