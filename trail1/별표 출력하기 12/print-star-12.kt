fun main() {
    val n = readln().toInt()
    var stars = List(n) { it * 2 }
    val width = 2 * (n - 1)

    repeat(n) { row ->
        if (stars.isEmpty()) return@repeat
        println((0..width step 2).joinToString(" ") { if (it in stars) "*" else " " })
        stars = when {
            row == 0 -> stars.filterIndexed { i, _ -> i % 2 == 1 }
            row % 2 == 1 -> stars.drop(1)
            else -> stars
        }
    }
}
