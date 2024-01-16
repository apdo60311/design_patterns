package behavioral_patterns.strategy_pattern.shop_example

class RegularDiscountStrategy : DiscountStrategy {
    override fun calculateDiscount(book: Book): Double {
        return book.price * 0.1
    }
}