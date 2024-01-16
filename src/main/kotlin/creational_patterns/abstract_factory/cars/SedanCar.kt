package creational_patterns.abstract_factory.cars

import creational_patterns.abstract_factory.enums.CarType
import creational_patterns.abstract_factory.enums.Location

class SedanCar(override var location: Location) : Car {
    override var model: CarType = CarType.SEDAN
}