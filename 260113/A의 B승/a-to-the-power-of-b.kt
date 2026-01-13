fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }
    println((1..b).fold(1L) { acc, _ -> acc * a })
}
