package behavioral_patterns.strategy_pattern.payment_example


interface PaymentStrategy {
    fun pay(amount: Double)
}

