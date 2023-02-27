package chapter05.section05.privatetest

fun main() {
    val pc = PrivateClass( )

//    pc.i
//    pc.privaetFunc()
    pc.access()
}

fun TopFunction(){
    val tpc = PrivateClass()
}

private class PrivateClass{
    private var i = 1

    private fun privateFunc(){
        i += 1
    }

    fun access(){
        privateFunc()
    }
}

class OtherClass{
//    val opc = PrivateClass( )

    fun test(){
        val pc = PrivateClass( )
    }
}