package chapter03.section05

fun main() {
    val number = 4
    val result:Long

    result = factorial(number)
    println("Factorial: $number -> $result")
}

private fun factorial(n: Int): Long{
    return if(n == 1) n.toLong() else n * factorial(n - 1)
}