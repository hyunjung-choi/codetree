fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }
    println((a..b).fold(1L) { acc, i -> acc * i })
}