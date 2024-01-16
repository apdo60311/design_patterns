package behavioral_patterns.strategy_pattern.payment_example

class CreditCardPaymentStrategy(private val cardNumber: String, private val expiryDate: String) : PaymentStrategy {
    override fun pay(amount: Double) {
        println("Paid $amount using credit card $cardNumber expiring on $expiryDate.")
    }
}