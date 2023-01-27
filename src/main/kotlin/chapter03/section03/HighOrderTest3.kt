package chapter03.section03

fun main() {
    val out = { println("Hello World!") }

    out()

    val new = out
    new()
}