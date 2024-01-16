package creational_patterns.singleton

open class Singleton private constructor() {


    companion object {
        private var instance: Singleton? = null;
        fun init(): Singleton {
            if (instance == null) {
                instance = Singleton()
            }
            return instance!!;
        }
    }


    var data : String = "default_data"
}