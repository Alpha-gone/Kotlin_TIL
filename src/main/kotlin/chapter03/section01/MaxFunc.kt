package chapter03.section01

fun max(a: Int, b:Int)  = if (a > b) a else b

fun main() {
    val num1 = 10
    val num2 = 3
    val result: Int

    result = max(num1, num2)

    println(result)
}