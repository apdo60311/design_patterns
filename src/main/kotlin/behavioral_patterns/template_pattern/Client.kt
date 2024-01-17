package behavioral_patterns.template_pattern

fun main() {
    val coffee = Coffee()
    println("Making coffee.....")
    coffee.makeBeverage()

    val tea = Tea()
    println("Making tea.....")
    tea.makeBeverage()
}
