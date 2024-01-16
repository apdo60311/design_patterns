package creational_patterns.factory_method.products

class ConcreteProductA : Product {
    override fun operation(): String {
        return "Concrete Product [1]"
    }
}