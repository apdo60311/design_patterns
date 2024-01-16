package creational_patterns.factory_method.creators

import creational_patterns.factory_method.products.ConcreteProductB
import creational_patterns.factory_method.products.Product

class ConcreteCreatorB : Creator() {
    override fun factoryMethod(): Product {
        return ConcreteProductB()
    }

    override var product: Product = factoryMethod()
}