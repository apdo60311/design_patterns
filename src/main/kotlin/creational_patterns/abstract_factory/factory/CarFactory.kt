package creational_patterns.abstract_factory.factory

import creational_patterns.abstract_factory.cars.Car
import creational_patterns.abstract_factory.enums.CarType

interface CarFactory {
    fun buildCar(carType: CarType) : Car;
}