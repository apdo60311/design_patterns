package creational_patterns.factory_method.creators

import creational_patterns.factory_method.products.ConcreteProductA
import creational_patterns.factory_method.products.Product


class ConcreteCreatorA : Creator() {
    override fun factoryMethod(): Product {
        return ConcreteProductA()
    }

    override var product: Product = factoryMethod()
}