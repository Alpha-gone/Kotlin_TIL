package chapter04.section02

fun main() {
    print("Enter the lines: ")
    val n = readlnOrNull()!!.toInt()

    for(line in 1..n){
        for(space in 1..(n - line)) print(" ")
        for(star in 1..(2 * line - 1)) print("*")

//        print(" ".repeat(n - line))
//        print("*".repeat(2* line - 1))

        println()
    }
}