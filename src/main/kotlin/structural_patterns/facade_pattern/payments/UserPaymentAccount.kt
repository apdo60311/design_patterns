package structural_patterns.facade_pattern.payments

class UserPaymentAccount(var balance : Double) {
    fun pay(amount : Double) : Boolean {
        return if (amount <= balance) {
            true
        }else {
            false
        }
    }
}
