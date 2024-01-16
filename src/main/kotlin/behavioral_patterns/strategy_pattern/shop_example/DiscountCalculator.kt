package behavioral_patterns.strategy_pattern.shop_example

class DiscountCalculator(private val discountStrategy: DiscountStrategy) {
    fun calculateDiscount(book: Book): Double {
        return discountStrategy.calculateDiscount(book)
    }
}