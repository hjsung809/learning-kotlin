package chapters.three

enum class Direction(val notation: String) {
    North("N"), South("S"), East("E"), West("W");

    val opposite: Direction
        get() = when(this) {
            North -> South
            South -> North
            East -> West
            West -> East
        }
}

fun main() {
    for (d in Direction.values()) {
        println("$d - ${d.opposite}")
    }
}