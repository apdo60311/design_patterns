package creational_patterns.abstract_factory.factory

import creational_patterns.abstract_factory.cars.Car
import creational_patterns.abstract_factory.cars.LuxuryCar
import creational_patterns.abstract_factory.cars.SedanCar
import creational_patterns.abstract_factory.cars.SmallCar
import creational_patterns.abstract_factory.enums.CarType
import creational_patterns.abstract_factory.enums.Location

class AsianCarFactory : CarFactory{
    private lateinit var car: Car

    override fun buildCar(carType: CarType): Car {
        car = when(carType) {
            CarType.SMALL -> SmallCar(Location.ASIA)
            CarType.SEDAN -> SedanCar(Location.ASIA)
            CarType.LUXURY -> LuxuryCar(Location.ASIA)
        }
        return  car
    }
}
