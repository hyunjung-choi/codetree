fun main() {
    val n = readln().toInt()

    println(
        (1..100)
            .scan(0) { acc, i -> acc + i }
            .indexOfFirst { it >= n }
    )
}
