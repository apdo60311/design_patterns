package structural_patterns.flyweight_pattern.bullet_example

data class Bullet(val x: Int, val y: Int, val bulletType: BulletType) {
    fun render() {
        println("Rendering bullet at ($x, $y) coordinates with damage = ${bulletType.damage}, speed = ${bulletType.speed}, texture = ${bulletType.texture}")
    }
}