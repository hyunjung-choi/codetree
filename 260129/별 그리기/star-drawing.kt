fun main() {
    val n = readln().toInt()

    (1..n).forEach { printRow(n, it) }

    (n - 1 downTo 1).forEach { printRow(n, it) }
}

fun printRow(n: Int, i: Int) {
    println(" ".repeat(n - i) + "*".repeat(2 * i - 1))
}
