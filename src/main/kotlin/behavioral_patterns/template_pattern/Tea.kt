package behavioral_patterns.template_pattern

class Tea : BeverageTemplate() {
    override fun brew() {
        println("Steeping the tea")
    }

    override fun addCondiments() {
        println("Adding lemon")
    }
}