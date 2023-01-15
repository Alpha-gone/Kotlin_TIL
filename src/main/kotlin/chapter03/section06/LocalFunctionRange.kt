package chapter03.section06

fun main() {
    a()
    //e()
}

fun a() = b()
fun b() = println("b")

fun c(){
    //fun d() = e()
    fun e() = println("e")
}

