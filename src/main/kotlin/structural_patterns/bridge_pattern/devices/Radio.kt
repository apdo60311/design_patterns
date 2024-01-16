package structural_patterns.bridge_pattern.devices

import structural_patterns.bridge_pattern.remotes.Channel

class Radio : Device {
    override fun isEnabled(): Boolean {
        TODO("Not yet implemented")
    }

    override fun enable() {
        TODO("Not yet implemented")
    }

    override fun disable() {
        TODO("Not yet implemented")
    }

    override fun getVolume(): Double {
        TODO("Not yet implemented")
    }

    override fun setVolume(percent: Double) {
        TODO("Not yet implemented")
    }

    override fun getChannel(): Channel {
        TODO("Not yet implemented")
    }

    override fun getChannelNumber(): Int {
        TODO("Not yet implemented")
    }

    override fun setChannel(channelIndex: Int) {
        TODO("Not yet implemented")
    }
}