package chapter05.section04.prisecon

fun main() {
    val p1 = Person("kildong", 30)

    println()

    val p2 = Person("Dooly")
}

class Person(firstName: String, out: Unit = println("[Primary Constructor] Parameter")){
    val fName = println("[Property] Person fName: $firstName")

    init {
        println("[init] Person init block")
    }


    constructor(firstName: String, age: Int, out: Unit = println("[Secondary Constructor] Parameter")):this(firstName){
        println("[Secondary Constructor] Body: $firstName, $age")
    }
}