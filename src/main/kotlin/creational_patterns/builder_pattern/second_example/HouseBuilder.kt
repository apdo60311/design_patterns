package creational_patterns.builder_pattern.second_example

import creational_patterns.builder_pattern.second_example.home_options.HomeOption


object HouseBuilder {
    private var homeOptions: MutableList<HomeOption> = mutableListOf()

     fun addHomeOption(option: HomeOption) : HouseBuilder {
        homeOptions.add(option)
        return this;
    }

     fun build(): House {
        return House(homeOptions)
    }
}