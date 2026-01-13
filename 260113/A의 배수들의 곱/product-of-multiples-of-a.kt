fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }
    println((1..b).filter { it % a == 0 }.fold(1L) { acc, i -> acc * i })
}
