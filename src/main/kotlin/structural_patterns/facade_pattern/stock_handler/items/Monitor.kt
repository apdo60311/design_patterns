package structural_patterns.facade_pattern.stock_handler.items

class Monitor (private var price : Double , private var name:String)  : Item {
    override fun getName(): String {
        return name
    }

    override fun getPrice(): Double {
        return price
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Monitor

        if (price != other.price) return false
        if (name != other.name) return false

        return true
    }

}