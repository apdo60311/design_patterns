package structural_patterns.facade_pattern.ordering

class OrderHandler(var order: Order) {

    fun placeOrder () {
        println("Order number ${order.orderNumber} placed Successfully")
    }

}

