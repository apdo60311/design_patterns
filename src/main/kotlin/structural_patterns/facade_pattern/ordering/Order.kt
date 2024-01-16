package structural_patterns.facade_pattern.ordering

import structural_patterns.facade_pattern.stock_handler.items.Item
import kotlin.math.abs
import kotlin.random.Random

class Order {
    var orderNumber : String = generateRandomId()

    private fun generateRandomId() = (abs(Random.nextInt()) * 10).toString()
    private var orderContent : MutableList<Item> = mutableListOf()

    fun addItemToOrder(item: Item) {
        orderContent.add(item)
    }

    fun getItems() : MutableList<Item> {
        return orderContent
    }
    fun isEmpty() : Boolean {
        return orderContent.isEmpty()
    }
    fun getTotalPrice() : Double {
        var totalPrice : Double = 0.0
        orderContent.forEach { item -> totalPrice += item.getPrice() }
        return totalPrice
    }
}