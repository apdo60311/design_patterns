package structural_patterns.facade_pattern

import structural_patterns.facade_pattern.payments.UserPaymentAccount
import structural_patterns.facade_pattern.invoice_handler.InvoiceHandler
import structural_patterns.facade_pattern.ordering.Order
import structural_patterns.facade_pattern.ordering.OrderHandler
import structural_patterns.facade_pattern.payments.PaymentHandler
import structural_patterns.facade_pattern.stock_handler.items.Item
import structural_patterns.facade_pattern.stock_handler.StockHandler

class PurchaseHandler(private var userPaymentAccount: UserPaymentAccount, ) {
    private var order: Order = Order()
    private var stockHandler : StockHandler = StockHandler()
    private lateinit var orderHandler : OrderHandler
    private lateinit var paymentHandler: PaymentHandler
    private lateinit var invoiceHandler: InvoiceHandler
    fun addToOrder(item: Item) : PurchaseHandler{
        val isAvailable : Boolean = stockHandler.checkAvailability(item)
        if (isAvailable) {
            order.addItemToOrder(item)
        } else {
            println("Item is unavailable")
        }
        return this
    }
    fun purchase() {
        if (!order.isEmpty()) {
            orderHandler = OrderHandler(order)
            paymentHandler = PaymentHandler(userPaymentAccount,order)
            invoiceHandler = InvoiceHandler(order)

            if (paymentHandler.pay()) {
                orderHandler.placeOrder()
                invoiceHandler.getInvoice();
            }

        } else {
            println("Cannot purchase empty order")
        }
    }
}