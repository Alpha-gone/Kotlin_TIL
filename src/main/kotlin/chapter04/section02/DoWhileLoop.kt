package chapter04.section02

fun main() {
    do {
        print("Endter an integer: ")
        val input = readln().toInt()

        for(i in 0..(input-1)){
            for(j in 0..(input-1)) print((i + j) % input + 1)
            println()
        }
    }while (input != 0)
}