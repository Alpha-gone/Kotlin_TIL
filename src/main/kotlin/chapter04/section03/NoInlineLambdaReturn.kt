package chapter04.section03

fun main() {
    retFunc()

}

private fun retFunc(){
    println("start of retFunc")

    //라벨
//    inlineLambda(13, 3) lit@{
//        a, b ->
//        val result = a + b
//        if(result > 10) return@lit
//        println("result: $result")
//    }

    //암묵적 라벨
//    inlineLambda(13, 3){
//        a, b ->
//        val result = a + b
//        if(result > 10) return@inlineLambda
//        println("result: $result")
//    }

    inlineLambda(13, 3 , fun (a, b){
        val result = a + b
        if (result > 10) return
        println("result: $result")
    })

    println("end of retFunc")
}
private fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit){
    out(a, b)
}