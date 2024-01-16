package creational_patterns.builder_pattern.second_example.home_options.option_types

enum class GarageType : OptionType {
    Normal,
    Modern;

    override fun toString(): String {
        return when(this) {
            Normal -> "Normal"
            Modern -> "Modern"
        }
    }
}