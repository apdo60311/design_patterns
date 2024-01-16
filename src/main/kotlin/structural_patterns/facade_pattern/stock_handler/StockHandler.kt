package structural_patterns.facade_pattern.stock_handler

import structural_patterns.facade_pattern.stock_handler.items.Item
import structural_patterns.facade_pattern.stock_handler.items.Monitor
import structural_patterns.facade_pattern.stock_handler.items.Pc

class StockHandler {
    private var content:MutableList<Item> = mutableListOf(Monitor(1000.0 , "Samsung"), Pc(10000.2 , "Lenovo"));

    fun addItemToStock(item: Item) {
        content.add(item);
    }


    fun checkAvailability(item: Item) : Boolean {
        return content.contains(item)
    }
}

