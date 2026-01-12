fun main() {
    val n = readln().toInt()
    val sum = (1 until n).filter { n % it == 0 }.sum()

    println(if (sum == n) "P" else "N")
}
