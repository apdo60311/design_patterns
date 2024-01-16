package structural_patterns.bridge_pattern.remotes

import structural_patterns.bridge_pattern.devices.Device

class AdvancedRemote(device: Device) : RegularRemote(device) {
    fun mute() {
        device.setVolume(0.0);
    }
    fun restart() {
        if (device.isEnabled()){
            device.disable()
            device.enable()
        }
    }
}