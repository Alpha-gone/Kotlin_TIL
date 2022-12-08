package chapter02.section2

fun main() {
    var a = 1
    var str1 = "a = $a"
    var str2 = "a = ${a + 2}"

    println("str1: \"$str1\", str2: \"$str2\"")

    val special = "\"hello\", I hava \$15"
    println(special)

    val special2 = "${'"'}${'$'}9.99${'"'}"
    println(special2)
}