package structural_patterns.facade_pattern.payments

class PaypalPayment(override var userPaymentAccount: UserPaymentAccount) : PaymentMethod {}