package creational_patterns.builder_pattern.second_example.home_options

import creational_patterns.builder_pattern.second_example.home_options.option_types.OptionType
import creational_patterns.builder_pattern.second_example.home_options.option_types.PoolType

class Pool (poolType : PoolType) : HomeOption{
    override var type: OptionType = poolType

    override fun toString(): String {
        return "$type Pool"
    }
}