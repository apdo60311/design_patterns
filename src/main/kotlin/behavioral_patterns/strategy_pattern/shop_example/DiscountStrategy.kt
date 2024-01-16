package behavioral_patterns.strategy_pattern.shop_example

interface DiscountStrategy {
    fun calculateDiscount(book: Book): Double
}

