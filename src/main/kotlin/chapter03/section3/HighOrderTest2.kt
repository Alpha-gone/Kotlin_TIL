package chapter03.section3

import chapter03.section1.sum

fun main() {
    var result: Int

    result = highOrder({x, y -> x + y}, 10, 20)
    println(result)
}

fun highOrder(Sum: (Int, Int) -> Int, a: Int, b: Int) = sum(a, b)