package structural_patterns.bridge_pattern.remotes

import structural_patterns.bridge_pattern.devices.Device


open class RegularRemote(protected var device: Device) : Remote {

    override fun togglePower() {
        if (device.isEnabled()) {
            device.disable()
        } else {
            device.enable()
        }
    }

    override fun channelUp() {
        device.setChannel(device.getChannelNumber() - 1)
    }

    override fun channelDown() {
        device.setChannel(device.getChannelNumber() + 1)
    }

    override fun VolumeUp() {
        device.setVolume(device.getVolume() + 1)
    }

    override fun VolumeDown() {
        device.setVolume(device.getVolume() - 1)

    }
}