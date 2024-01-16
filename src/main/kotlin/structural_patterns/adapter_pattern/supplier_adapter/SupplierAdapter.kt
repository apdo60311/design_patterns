package structural_patterns.adapter_pattern.supplier_adapter

import structural_patterns.adapter_pattern.supplier.Volt

interface SupplierAdapter {
    fun get100Volts() : Volt;
    fun get30Volts() : Volt;
    fun get10Volts() : Volt;
}