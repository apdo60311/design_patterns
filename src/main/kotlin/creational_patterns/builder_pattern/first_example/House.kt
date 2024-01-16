package creational_patterns.builder_pattern.first_example

import kotlin.properties.Delegates

/**
 * This implementation taken from Sandesh Bodake's article in medium
 * */

class House {
    private var window: Int
    private var door: Int
    var room: Int
    private var hasGarden: Boolean
    private var hasSwimmingPool: Boolean

    constructor(window: Int, door: Int, room: Int, hasGarden: Boolean, hasSwimmingPool: Boolean) {
        this.window = window
        this.door = door
        this.room = room
        this.hasGarden = hasGarden
        this.hasSwimmingPool = hasSwimmingPool
    }

    constructor(build: HouseBuilder) : this(window = build.window,
        door = build.door,
        room = build.room,
        hasGarden = build.hasGarden,
        hasSwimmingPool = build.hasSwimmingPool)

    class HouseBuilder {
        // Delegates.notNull() --> ensure that variable when initialized won't be null
        var window by Delegates.notNull<Int>()
        var door by Delegates.notNull<Int>()
        var room by Delegates.notNull<Int>()
        var hasGarden by Delegates.notNull<Boolean>()
        var hasSwimmingPool by Delegates.notNull<Boolean>()


        // set every property separately
        fun window(value: HouseBuilder.() -> Int) = apply { window = value() }
        fun door(value: HouseBuilder.() -> Int) = apply { door = value() }
        fun room(value: HouseBuilder.() -> Int) = apply { room = value() }
        fun hasGarden(value: HouseBuilder.() -> Boolean) = apply { hasGarden = value() }
        fun hasSwimmingPool(value: HouseBuilder.() -> Boolean) = apply { hasSwimmingPool = value() }

    }

    // static function build to build the whole House
    companion object {
        fun build(init : HouseBuilder.() -> Unit): House {
            return House(HouseBuilder().apply(init))
        }
    }

}
