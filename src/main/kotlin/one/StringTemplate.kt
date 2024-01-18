package one


fun main() {
    val a = "aaa"
    println("a is $a")
    println("\"\$a\" is $a")
    println("""$\"a\" is $a""")

    println("a is ${1 + 2 + 3}")
}