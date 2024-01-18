package chapters.two

fun main() {
    val ascii = mapOf("A" to 65, "B" to 66, "C" to 67)
    println(ascii["A"] == 65)

    printMap(ascii)

    println(ascii == mapOf("A" to 65, "B" to 66, "C" to 67))

    // mutable map이 아니지만 -연산은 새로운 객체를 리턴해서 사용가능한듯.
    printMap(mapOf("A" to 65, "B" to 66, "C" to 67, "D" to 68) - "D")
    println(ascii == (mapOf("A" to 65, "B" to 66, "C" to 67, "D" to 68) - "D"))

    //error
//    ascii["D"] = 68
    val mAscii = ascii.toMutableMap()
    mAscii["D"] = 68
    mAscii.put("E", 69)
    mAscii += "F" to 70
    mAscii += "F" to 71 // 덮어씌워짐
    printMap(mAscii)
    println(ascii != mAscii)
}

fun printMap(map: Map<String, Int>) {
    for((key, value) in map)
        print("$key:$value ,")
    println()
}