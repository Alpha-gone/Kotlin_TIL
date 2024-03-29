package chapter05.section06.composition

fun main() {
    val car = Car("tico", "100hp")

    car.startEngine()
    car.stopEngine()
}

class Car(val name: String, val power: String){
    private var engine = Engine(power)

    fun startEngine() = engine.start()
    fun stopEngine() = engine.stop()
}

class Engine(power: String){
    fun start() = println("Engine has been started")
    fun stop() = println("Engine has been stopped")
}