package structural_patterns.facade_pattern.stock_handler.items

class Pc (private var price : Double, private var name:String)  : Item {
    override fun getName(): String {
        return name
    }

    override fun getPrice(): Double {
        return price
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Pc

        if (price != other.price) return false
        if (name != other.name) return false

        return true
    }

}