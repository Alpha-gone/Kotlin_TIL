package chapter03.section01

fun sum(a: Int, b: Int): Int{
    return a + b
}

fun sum1(a: Int, b: Int): Int = a + b

fun sum2(a: Int, b: Int) = a + b

fun main() {
    val result1 = sum(3, 2)
    val result2 = sum(6, 7)

    println(result1)
    println(result2)


}