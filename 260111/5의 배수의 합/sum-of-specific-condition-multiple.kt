fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }
    val range = if (a <= b) a..b else b..a
    val sum = range.filter { it % 5 == 0 }.sum()

    println(sum)
}