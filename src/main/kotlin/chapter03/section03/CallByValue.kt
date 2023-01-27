package chapter03.section03

fun main() {
    val result = callByValue(lambda( ))
    println(result)
}

fun callByValue(b: Boolean): Boolean{
    println("callByValue function")
    return b
}

val lambda = {
    println("lambda  function")
    true
}