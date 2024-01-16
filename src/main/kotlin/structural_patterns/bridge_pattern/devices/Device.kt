package structural_patterns.bridge_pattern.devices

import structural_patterns.bridge_pattern.remotes.Channel

interface Device {
    fun isEnabled() : Boolean
    fun enable()
    fun disable()
    fun getVolume() : Double
    fun setVolume(percent : Double)
    fun getChannel() : Channel
    fun getChannelNumber() : Int
    fun setChannel(channelIndex : Int)
}
