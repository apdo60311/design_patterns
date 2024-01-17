package behavioral_patterns.template_pattern


abstract class BeverageTemplate {
    fun makeBeverage() {
        boilWater()
        brew()
        pourInCup()
        addCondiments()
    } // template method

    abstract fun brew()
    abstract fun addCondiments()
    private fun boilWater() {
        println("Boiling water")
    }
    private fun pourInCup() {
        println("Pouring into cup")
    }
}


