package chapters.three

data class DataClass(
    val a: String,
    val innerDataClass: InnerDataClass
)

data class InnerDataClass(
    val b: String
)

fun main() {
    // 비교는 depp, 복사는 shallow

    // recursive, deelp
    println(DataClass("hello", InnerDataClass("a")) == DataClass("hello", InnerDataClass("a")))
    println(!(DataClass("hello", InnerDataClass("a")) == DataClass("hello", InnerDataClass("b"))))

    // shallow
    val dc = DataClass("copy", InnerDataClass("test"))
    println(dc)
    val dc2 = dc.copy()
    println(dc2)

    println(dc == dc2) // 동등하다
    println(dc === dc2) // 동일하지 않다

    println(dc.innerDataClass == dc2.innerDataClass) // 동등하다
    println(dc.innerDataClass === dc2.innerDataClass) // 동일하다. (shallow copy ?)
}