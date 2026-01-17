fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }

    val hasCommonDivisor = (a..b).any { num ->
        1920 % num == 0 && 2880 % num == 0
    }

    println(if (hasCommonDivisor) 1 else 0)
}
