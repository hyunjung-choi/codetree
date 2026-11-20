fun main() {
    val n = readln().trim().toInt()
    println((1..n).joinToString("\n") { "$it".repeat(n) })
}