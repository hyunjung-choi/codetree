fun main() {
    val n = readln().toInt()

    val x = generateSequence(n) { current ->
        if (current > 1) current / 2 else null
    }.count() - 1

    println(x)
}
