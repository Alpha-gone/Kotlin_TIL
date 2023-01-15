package chapter03.section3.funcfunc

fun main() {
    println("funcFunc: ${funcFunc()}")
}

fun funcFunc() = sum(2, 2)
private fun sum(a: Int, b: Int) = a + b
