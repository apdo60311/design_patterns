package structural_patterns.adapter_pattern.supplier

open class Supplier {
    fun getVolt() : Volt {
        return Volt(240)
    }
}