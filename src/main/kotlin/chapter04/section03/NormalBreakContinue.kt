package chapter04.section03

fun main() {
    //labelBreak()

    labelContinue()

    for (i in 1..5){
        if(i==3) break
        print(i)
    }

    println()
    println("outside")
}

private fun labelBreak(){
    println("labelBreak")

    first@for (i in 1..5){
        second@for(j in 1..5){
            if (j==3) break@first
            println("i: $i, j: $j")
        }

        println("after for j")
    }

    println("atfer for i")
}

private fun labelContinue(){
    println("labelBreak")

    first@for (i in 1..5){
        second@for(j in 1..5){
            if (j==3) continue@first
            println("i: $i, j: $j")
        }

        println("after for j")
    }

    println("atfer for i")
}