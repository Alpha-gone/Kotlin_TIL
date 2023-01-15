package chapter03.section05

fun main() {
    shortFunc(3){ println("First call: $it") }
}

private inline fun shortFunc(a:Int, noinline out:(Int) -> Unit){
    println("Before calling out()")
    out(a)
    println("After calling out()")
}