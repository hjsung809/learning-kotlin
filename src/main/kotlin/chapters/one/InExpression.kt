package chapters.one

fun main() {
    val range = 100 .. 1000

    println(-1 in range)
    println(10 in range)
    println(500 in range)
    println(100000 in range)

    println("double")
    val doubleRange = 10.0..1000.0
    println(-1.0 in doubleRange)
    println(10.0 in doubleRange)
    println(500.0 in doubleRange)
    println(100000.0 in doubleRange)


    println("string")
    println('h' in "hello")
    println('z' in "hello")
}