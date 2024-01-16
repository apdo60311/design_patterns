package structural_patterns.adapter_pattern.devices

import structural_patterns.adapter_pattern.supplier.Volt

class Laptop : Device {
    override fun work(power: Volt) {
        if (power.volt < 30) {
            println("Not Working!!")
        } else if (power.volt > 30) {
            println("Danger!!")
        } else {
            println("Working on ${power.volt} volts...")
        }
    }

    override fun charge(power: Volt) {
        if (power.volt < 100) {
            println("Not Charging!!")
        } else if (power.volt > 100) {
            println("Danger!!")
        } else {
            println("Charging on ${power.volt} volts...")
        }
    }
}