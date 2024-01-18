package chapters.two

fun main() {
    val colorSet = setOf("red", "green", "blue")
    val mColorSet = colorSet.toMutableSet();
    println(mColorSet == setOf("red", "green", "blue"))

    mColorSet -= "red"
    println(mColorSet == setOf("green", "blue"))

    mColorSet += "red"
    mColorSet += "red"
    println(mColorSet == setOf("green", "blue", "red"))
    println("blue" in mColorSet)


    // - 연산이 원본 객체를 손상하지 않고 새로운 객체를 반환하는 것으로 보임.
    val newSet =  mColorSet - mutableSetOf("green", "red")
    println("green" !in newSet)
    println("red" !in newSet)
    println("blue" in newSet)

    println("green" in mColorSet)
    println("red" in mColorSet)
    println("blue" in mColorSet)

    // 원본 객체를 바꾸는 법
    mColorSet.removeAll(setOf("green", "red"))
    println("green" !in mColorSet)
    println("red" !in mColorSet)
    println("blue" in mColorSet)
}