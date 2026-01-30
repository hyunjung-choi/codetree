fun main() {
    val n = readln().toInt()

    val pattern = mutableListOf(n)
    for (i in 1 until n) {
        pattern.add(if (i % 2 == 1) (i + 1) / 2 else n - i / 2)
    }

    (pattern + pattern.reversed()).forEach { count ->
        println("* ".repeat(count).trim())
    }
}
