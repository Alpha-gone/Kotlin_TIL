package chapter03.section03


fun main() {
    noParam ({ "Hello World!" })
    noParam { "Hello World!" }

    oneParam ({ a -> "Hello Wolrd! $a" })
    oneParam { a -> "Hello WOrld! $a" }
    oneParam { "Hello World! $it" }

    moreParam({a, b -> "Hello World! $a $b"})
    moreParam{_, b -> "Hello World! $b"}

    withArgs("Args1", "Args2", {a, b -> "Hello World! $a $b"})
    withArgs("Args1", "Args2") {a, b -> "Hello World! $a $b"}
}

fun noParam(out: () -> String) = println(out())
fun oneParam(out: (String) -> String) = println(out("OneParam"))
fun moreParam(out: (String, String) -> String) = println(out("OneParam", "TwoParam"))
fun withArgs(a: String, b: String, out: (String, String) -> String) = println(out(a, b))

