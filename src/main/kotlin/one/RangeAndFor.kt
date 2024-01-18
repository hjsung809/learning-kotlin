package one

fun main() {
    for(a in 1..3)
        print(a)

    println()
    val b = 3..10 step 2
    for(c in b)
        print(c)
    println()
    val d = 3 downTo 0
    for(e in d)
        print("$e ")

    val f = 5 until  10

    println()
    for(ch in "abcde")
        print(ch + 1)
}