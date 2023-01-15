package chapter03.section05

fun main() {
 shortFunc(3){
     println("First call: $it")

 }
}

private inline fun shortFunc(a:Int, crossinline out:(Int) -> Unit){
    println("Before calling out()")
    nestedFunc { out(a) }
    println("After calling out()")
}

fun nestedFunc(body: () -> Unit){
    body()
}