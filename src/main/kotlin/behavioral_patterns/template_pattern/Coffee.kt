package behavioral_patterns.template_pattern

class Coffee : BeverageTemplate() {
    override fun brew() {
        println("Brewing coffee grounds")
    }

    override fun addCondiments() {
        println("Adding sugar and milk")
    }
}