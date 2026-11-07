fun main() {
    val n = readln().trim().toInt()

    val result = buildString {
        for (i in 0 until n) {
            val line = (0 until n).joinToString(" ") { j ->
                if (i == 0 || j < i || j == n - 1) "*" else " "
            }
            appendLine(line)
        }
    }
    print(result)
}
