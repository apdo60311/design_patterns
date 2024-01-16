package structural_patterns.facade_pattern.stock_handler.items

interface Item {
    fun getName() : String
    fun getPrice() : Double
}