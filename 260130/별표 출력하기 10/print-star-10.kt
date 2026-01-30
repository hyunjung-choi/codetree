fun main() {
    val n = readln().toInt()

    val pattern = (1..n).map { i ->
        if (i % 2 == 1) (i + 1) / 2 else n - i / 2 + 1
    }

    (pattern + pattern.reversed()).forEach { count ->
        println("* ".repeat(count).trim())
    }
}
