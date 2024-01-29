package chapters.three


fun main() {
    val  s1 = "abc"
    val s2: String? = null
    val s3 = s2
    val s4: String = s3 ?: "not null"


    println(s2)
    println(s3)
    println(s4)

    val s5: String? = "abc"
    println(s5!!.length)
}