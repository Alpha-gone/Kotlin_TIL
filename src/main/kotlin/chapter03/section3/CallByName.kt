package chapter03.section3

fun main() {
    val result = callByName(otherLambda)
    println(result)
}

fun callByName(b: () -> Boolean): Boolean{
    println("callByName function")
    return b()
}

val otherLambda = {
    println("otherLambda function")
    true
}