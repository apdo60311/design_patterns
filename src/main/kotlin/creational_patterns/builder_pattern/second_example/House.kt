package creational_patterns.builder_pattern.second_example

import creational_patterns.builder_pattern.second_example.home_options.HomeOption

class House(homeOptions: List<HomeOption>) {
    private var homeOptions:List<HomeOption>

    init {
        this.homeOptions = homeOptions
    }

    fun showHouse() {
        for(option in homeOptions) {
            println(option.toString())
        }
    }
}

