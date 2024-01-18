package chapters.two

class SetAndGet {
    var i: Int = 0
    get() {
        println("get return $field")
        return field
    }
    set(value) {
        println("$field set to $value")
        field = value
    }
}

fun main() {
    val sg = SetAndGet()
    sg.i
    sg.i = 1
}