package chapter05.section02.primary

fun main() {
    val coco = Bird("mybird", 2, "short", "blue")
    coco.color = "yellow"

    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}

private class Bird(var name: String, var wing: Int, var beak: String, var color: String){
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}