fun main() {
    val n = readln().toInt()

    val count = generateSequence(n) { current ->
        when {
            current >= 1000 -> null
            current % 2 == 0 -> current * 3 + 1
            else -> current * 2 + 2
        }
    }.count() - 1

    println(count)
}
