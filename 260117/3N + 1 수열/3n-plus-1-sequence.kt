fun main() {
    val n = readln().toInt()

    val count = generateSequence(n) { current ->
        when {
            current == 1 -> null
            current % 2 == 0 -> current / 2
            else -> 3 * current + 1
        }
    }.count() - 1

    println(count)
}
