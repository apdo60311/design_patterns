package structural_patterns.facade_pattern.invoice_handler

import structural_patterns.facade_pattern.ordering.Order

class InvoiceHandler(var order: Order) {

    private var invoice : MutableList<Pair<String , Double>> = mutableListOf();
    fun getInvoice() : MutableList<Pair<String , Double>>{
        for (item in order.getItems()) {
            invoice.add(Pair(item.getName() , item.getPrice()))
        }
        invoice.add(Pair("Total" , order.getTotalPrice()))
        return invoice
    }

}