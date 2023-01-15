package chapter03.section05

fun main() {
    val number = 5

    println("Factorial: $number -> ${factorial(number)}")
}

private tailrec fun factorial(n: Int, run: Int = 1): Long{
    return if(n == 1) run.toLong() else factorial(n - 1, run * n)
}