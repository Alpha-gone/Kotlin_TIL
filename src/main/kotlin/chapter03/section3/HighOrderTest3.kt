package chapter03.section3

fun main() {
    val out = { println("Hello World!") }

    out()

    val new = out
    new()
}