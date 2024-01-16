package creational_patterns.abstract_factory.cars

import creational_patterns.abstract_factory.enums.CarType
import creational_patterns.abstract_factory.enums.Location

interface Car {
    var model:CarType
    var location:Location

}