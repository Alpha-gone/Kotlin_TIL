package chapter05.section05.burglar

fun main() {
//    val car = Car()
    val tico = Tico("kildong", true)
    tico.acess("gotico")

    val burglar = Burglar()
    burglar.steal(tico)
}

open class Car protected constructor(_year: Int, _model: String, _power: String, _wheel: String){
    private var year: Int = _year
    var model: String = _model
    protected open var power: String = _power
    internal var wheel: String = _wheel

    protected fun start(key: Boolean){
        if (key) println("Start the Engine!")
    }

    class Driver(_name: String, _license: String){
        private var name: String = _name
        var license: String = _license

        internal fun driving() = println("[Driver] Driving( ) - $name")
    }
}

class Tico(_year: Int, _model: String, _power: String, _wheel: String, var name: String, private var key: Boolean)
    : Car(_year, _model, _power, _wheel){
    override var power: String = "50hp"

    var driver = Driver(name, "first class")

    constructor(_name: String, _key: Boolean) : this(2014, "basic", "100hp",
        "normal", _name, _key){
        name = _name
        key = _key
    }

    fun acess(password: String){
        if (password == "gotico"){
            println("----[Tico] access( )--------")
//            super.year
            println("super.model = ${super.model}")
            println("super.power = ${super.power}")
            println("super.wheel = ${super.wheel}")
            super.start(key)

//            driver.name
            println("Driver().license = ${driver.license}")
            driver.driving()
        }else{
            println("You're a burglar")
        }
    }
}

class Burglar(){
    fun steal(anyCar: Any){
        if (anyCar is Tico){
            println("----[Burglar] stral()-----------")
//            println(anyCar.power)
//            println(anyCar.year)
            println("anyCar.name = ${anyCar.name}")
            println("anyCar.wheel = ${anyCar.wheel}")
            println("anyCar.model = ${anyCar.model}")

            println(anyCar.driver.license)
            anyCar.driver.driving()
//            println(Car.start())
            anyCar.acess("dontknow")
        }else{
            println("Nothing to steal")
        }
    }
}