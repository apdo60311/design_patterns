package structural_patterns.adapter_pattern.supplier_adapter

import structural_patterns.adapter_pattern.supplier.Supplier
import structural_patterns.adapter_pattern.supplier.Volt

class SupplierAdapterClassImplementation : SupplierAdapter , Supplier() {
    override fun get100Volts(): Volt {
        return convertVolts(100)
    }

    override fun get30Volts(): Volt {
        return convertVolts(30)
    }

    override fun get10Volts(): Volt {
        return convertVolts(10)
    }

    fun convertVolts(to : Int) : Volt {
        val division : Double = to.toDouble() / this.getVolt().volt.toDouble()
        return Volt((this.getVolt().volt * division).toInt())
    }
}