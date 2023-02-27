package chapter05.section05.internal

fun main() {
    val mic = InternalClass()

    mic.i
    mic.icFunc()

}

internal class InternalClass{
    internal var i = 1

    internal fun icFunc(){
        i += 1
    }

    fun access(){
        icFunc()
    }
}

class Other{
    internal val ic = InternalClass()

    fun test(){
        ic.i
        ic.icFunc()
    }
}