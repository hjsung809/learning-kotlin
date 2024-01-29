package chapters.three

val String.xxx: String
    get() = if(isEmpty()) {
        "empty string"
    } else {
        this.toString()
    }

fun main() {
    val a = ""
    println(a.xxx)

    val b = "b"
    println(b.xxx)
}