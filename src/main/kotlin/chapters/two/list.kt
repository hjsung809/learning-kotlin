package chapters.two


fun main() {
    var list = listOf(1, 2, 3);
    for(x in list) {
        println(x)
    }

    var mutableList = mutableListOf(1, 2, 3);
    mutableList.add(4);

    var mlAsList : List<Int> = mutableList
    mlAsList += 5
    mlAsList -= 1
    println(mutableList);

    val first = mutableListOf(1)
    val second : List<Int> = first // add 가 없음.

    first += 2
    println(second)
}