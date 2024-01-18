package two

fun main() {
    vararg("first")
    vararg("first", 1, 2, 3)
    vararg("first", 0, *intArrayOf( 1, 2, 3), 4)
}

fun vararg(name: String, vararg ints: Int) {
    println("name: $name")
    printArr(ints)
}

fun printArr(ints: IntArray) {
    for(element in ints) {
        print("$element ")
    }
    println()
}