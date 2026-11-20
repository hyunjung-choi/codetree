fun main() {
    val n = readln().trim().toInt()
    println((n downTo 1).joinToString("\n") { i ->
        (n downTo 1).joinToString(" ") { j ->
            "($i,$j)"
        }
    })
}
