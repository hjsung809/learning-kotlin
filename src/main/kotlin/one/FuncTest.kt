package one

fun test1(flag: Boolean): String {
    if (flag) {
        return "a"
    } else {
        return "b"
    }
}

fun test2(flag: Boolean): String =
    if (flag) {
        "a"
    } else {
        "b"
    }


fun test3(flag: Boolean): String {
    return if (flag) {
        "a"
    } else {
        "b"
    }
}

fun main() {
    println(test1(true))
    println(test1(false))
    println(test2(true))
    println(test2(false))
    println(test3(true))
    println(test3(false))
}