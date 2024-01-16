package behavioral_patterns.strategy_pattern.payment_example

class PayPalPaymentStrategy(private val email: String) : PaymentStrategy {
    override fun pay(amount: Double) {
        println("Paid $amount using PayPal account $email.")
    }
}