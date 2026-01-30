fun main() {
    val n = readln().toInt()

    repeat(n) { i ->
        val count = if ((i + 1) % 2 == 0) i + 1 else 1
        println("* ".repeat(count).trim())
    }
}
