package chapters.one

fun main() {
    var a = 1;
    val b = 2;
    val c = """
        aaa
        
        bbb
        ccc
    """.trimIndent()
    System.out.println(c);

    val str : String = "b" + 1;
    println(str)

    println("Hello, world!")
    foo(a, b);
}

fun foo(a:Int, b:Int) {
    println(a + b);
}
