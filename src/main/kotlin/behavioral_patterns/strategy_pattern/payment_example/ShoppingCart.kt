package behavioral_patterns.strategy_pattern.payment_example

class ShoppingCart(private val paymentStrategy: PaymentStrategy) {
    private val items = mutableListOf<Pair<String, Double>>()

    fun addItem(item: String, price: Double) {
        items.add(item to price)
    }

    fun checkout() {
        val totalAmount = items.sumByDouble { it.second }
        paymentStrategy.pay(totalAmount)
        println("Items purchased: $items")
    }
}