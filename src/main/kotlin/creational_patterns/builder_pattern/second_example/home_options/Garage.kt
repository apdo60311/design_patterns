package creational_patterns.builder_pattern.second_example.home_options

import creational_patterns.builder_pattern.second_example.home_options.option_types.GarageType
import creational_patterns.builder_pattern.second_example.home_options.option_types.OptionType

class Garage(garageType: GarageType) : HomeOption {
    override var type: OptionType = garageType

    override fun toString(): String {
        return "$type Garage"
    }
}