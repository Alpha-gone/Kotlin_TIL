package chapter02.section2

import javax.print.DocFlavor.STRING

typealias Username = String
fun main() {
    val num = 10
    val formattedString = """
        var a = 6
        var b = "Kotlin"
        println(a + num)
    """

    println(formattedString)

    val user : Username = "Kildong"

    println(user)
}