fun main() {
    val n = readln().toInt()

    (1..n).forEach { i ->
        println(" ".repeat((n - i) * 2) + List(i) { "@" }.joinToString(" "))
    }

    (n - 1 downTo 1).forEach { i ->
        println(List(i) { "@" }.joinToString(" "))
    }
}
