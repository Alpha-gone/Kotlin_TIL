package chapter03.section05

fun main() {
    val multi = 3 multiply 10
    println("multi: $multi")
}

infix fun Int.multiply(x:Int) = this * x
