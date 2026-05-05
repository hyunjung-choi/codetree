fun main() {
    val n = readln().toInt()
    val lines = 2 * n + 1

    repeat(lines) { i ->
        val line = if (i % 2 == 0) {
            "* ".repeat(lines)
        } else {
            "*   ".repeat(n + 1)
        }
        println(line.trim())
    }
}
