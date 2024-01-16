package creational_patterns.factory_method.creators

import creational_patterns.factory_method.products.Product

abstract class Creator {
    abstract fun factoryMethod() : Product
    abstract var product: Product

    fun someOperation() {
        println(product.operation())
    }
}