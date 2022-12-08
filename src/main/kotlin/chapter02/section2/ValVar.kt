package chapter02.section2

fun main() {
    val number = 10
    var language = "Korean"
    val secondNumber: Int = 20
    language = "English"

    println("number : $number")
    println("language: $language")
    println("secondNumber: $secondNumber")

    val num05 = 127
    val num06 = -32768
    val num07 = 2147483647
    val num08 = 9223372036854775807

    val exp01 = 123
    val exp02 = 123L
    val exp03 = 0x0F
    val exp04 = 0b00001011

    val exp08: Byte = 127
    val exp09 = 32767
    val exp10: Short = 32767

    val uint: UInt = 153u
    val ushort: UShort = 65535u
    val ulong: ULong = 46322342uL
    val ubyte: UByte = 255u

    val number02 = 1_000_000
    val chardNum = 1234_1234_1234_1234L
    val hexVal = 0xAB_CD_EF_12
    val bytes = 0b1101_0010

    val exp11 = 3.14
    val exp12 = 3.14F

    val exp13 = 3.14e-2
    val exp14 = 3.14e2

    var num: Double = 0.1

    for(x in 0..999){
        num += 0.1
    }

    println(num)
}