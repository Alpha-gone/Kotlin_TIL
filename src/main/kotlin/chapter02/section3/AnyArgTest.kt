package chapter02.section3

fun main() {
    checkArg("Hello")
    checkArg(5)
}

fun checkArg(x: Any){
    if(x is String) println("x Is String: $x")
    if(x is Int) println("x Is Int: $x")
}