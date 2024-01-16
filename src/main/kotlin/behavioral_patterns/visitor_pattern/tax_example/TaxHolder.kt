package behavioral_patterns.visitor_pattern.tax_example

import behavioral_patterns.visitor_pattern.exporter_example.Visitor

interface TaxHolder {
    fun accept(taxCollector : TaxCollector)
}

// visitor interface
interface TaxCollector {
    fun visit(element: Element)
}

interface Element {
    fun getValue() : Double
    fun accept(taxCollector: TaxCollector)
}

class GovernmentTaxHolder(private val listOfProperty: List<Element>) : TaxHolder {
    override fun accept(taxCollector: TaxCollector) {
        listOfProperty.forEach {
            it.accept(taxCollector)
        }
    }
}

class ConcreteTaxCollectorA : TaxCollector {
    override fun visit(element: Element) {
        println("Total Tax = ${element.getValue() * (10.0/100.0)}  using A tax collector")
    }
}
class ConcreteTaxCollectorB : TaxCollector {
    override fun visit(element: Element) {
        println("Total Tax = ${element.getValue() * (5.0/100.0)} using B tax collector")
    }
}

class Company : Element {
    private val value : Double = 1200.0
    override fun getValue(): Double = value
    override fun accept(taxCollector: TaxCollector) {
        taxCollector.visit(this)
    }
}
class House : Element {
    private val value : Double = 200.0
    override fun getValue(): Double = value
    override fun accept(taxCollector: TaxCollector) {
        taxCollector.visit(this)
    }
}
class GroceryShop : Element {
    private val value : Double = 100.0
    override fun getValue(): Double = value
    override fun accept(taxCollector: TaxCollector) {
        taxCollector.visit(this)
    }
}