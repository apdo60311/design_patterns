package structural_patterns.bridge_pattern.devices

import structural_patterns.bridge_pattern.remotes.Channel

class Tv : Device {
    private var isEnabled : Boolean = false
    private var volume : Double = 3.0
    private var channelList : MutableList<Channel> = mutableListOf()
    private var currentChannelIndex = 1

    init {
        channelList.add(Channel("channel 1" , 1))
        channelList.add(Channel("channel 2" , 2))
        channelList.add(Channel("channel 3" , 3))
        channelList.add(Channel("channel 4" , 4))
    }

    override fun isEnabled(): Boolean {
        return  isEnabled
    }

    override fun enable() {
        isEnabled = true
    }

    override fun disable() {
        isEnabled = false
    }

    override fun getVolume(): Double {
        return volume
    }

    override fun setVolume(percent: Double) {
        volume = percent
    }

    override fun getChannel(): Channel {
        if (channelList.isEmpty()) throw Exception("No channels")
        return channelList[currentChannelIndex]
    }

    override fun getChannelNumber(): Int {
        return currentChannelIndex
    }

    override fun setChannel(channelIndex: Int) {
        currentChannelIndex = if (channelIndex >= channelList.size) 0
        else if (channelIndex < 0) channelList.size - 1
        else channelIndex
    }
}