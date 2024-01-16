package structural_patterns.facade_pattern.payments

import structural_patterns.facade_pattern.ordering.Order

class PaymentHandler(private var userPaymentAccount: UserPaymentAccount, private var order: Order) {
    fun pay() : Boolean {
        if (order.getTotalPrice() <= userPaymentAccount.balance) {
            if (userPaymentAccount.pay(order.getTotalPrice())) {
                println("Payment succeeded")
                return true
            } else {
                println("Payment Declined")
                return false
            }
        } else {
            println("Payment Declined")
            return false
        }
    }

}