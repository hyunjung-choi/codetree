fun main() {
    val n = readln().toInt()

    println(
        (1..10)
            .scan(1) { acc, i -> acc * i }
            .indexOfFirst { it >= n }
    )
}
