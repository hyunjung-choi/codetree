fun main() {
    val (a, b, c) = readln().split(" ").map { it.toInt() }

    val hasMultiple = (a..b).any { it % c == 0 }

    println(if (hasMultiple) "YES" else "NO")
}
