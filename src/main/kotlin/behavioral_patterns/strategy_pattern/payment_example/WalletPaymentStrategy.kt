package behavioral_patterns.strategy_pattern.payment_example

class WalletPaymentStrategy(private val walletId: String) : PaymentStrategy {
    override fun pay(amount: Double) {
        println("Paid $amount using wallet $walletId.")
    }
}