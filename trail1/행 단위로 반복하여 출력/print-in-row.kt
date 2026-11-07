fun main() {
    val n = readln().trim().toInt()
    val line = (1..n).joinToString("")
    repeat(n) { println(line) }
}
