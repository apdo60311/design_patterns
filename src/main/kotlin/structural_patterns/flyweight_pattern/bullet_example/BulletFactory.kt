package structural_patterns.flyweight_pattern.bullet_example

object BulletFactory {
    private val bulletTypes: MutableMap<String, BulletType> = HashMap()

    fun getBulletType(damage: Int, speed: Int, texture: String): BulletType {
        val key = "($damage|$speed|$texture)"
        return bulletTypes.getOrPut(key) { BulletType(damage, speed, texture) }
    }
}