package chapter04.section03

fun main() {
    retFunc()
}

private fun retFunc(){
    println("start of retFunc")

    inlineLambda(13, 3){
        a, b ->
        val result = a + b
        if(result > 10) return
        println("result: $result")
    }

    println("end of retFunc")
}
private inline fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit){
    out(a, b)
}