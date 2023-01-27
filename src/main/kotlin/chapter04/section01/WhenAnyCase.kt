package chapter04.section01

fun main() {
    case("Hello")
    case(1)
    case(System.currentTimeMillis())
    case(MyClass())
}

fun case(obj: Any){
    when(obj){
        1 -> println("Int: $obj")
        "Hello" -> println("String: $obj")
        is Long -> println("Long: $obj")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
}

class MyClass