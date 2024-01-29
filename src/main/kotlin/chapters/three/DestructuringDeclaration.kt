package chapters.three


data class SomeData(
    val a: String,
    val b: String,
    val c: Int,
    val d: Int
)

fun foo() = SomeData("a", "b", 1, 2)

fun bar() = Triple(1, 2, 3)

fun main() {
    val (a, _, _, b) = foo() // 순서가 바뀌면 위험하다.
    println("a: $a, b: $b")

    val (c, d) = bar();
    println("c: $c, d: $d")
}