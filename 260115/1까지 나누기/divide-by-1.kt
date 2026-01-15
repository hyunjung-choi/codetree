fun main() {
    val n = readln().toInt()

    println(
        generateSequence(1) { it + 1 }
            .runningFold(n) { acc, divisor -> acc / divisor }
            .indexOfFirst { it <= 1 }
    )
}
