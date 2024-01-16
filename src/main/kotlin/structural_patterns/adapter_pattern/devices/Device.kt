package structural_patterns.adapter_pattern.devices

import structural_patterns.adapter_pattern.supplier.Volt

interface Device {
    fun work(power: Volt)
    fun charge(power: Volt)
}