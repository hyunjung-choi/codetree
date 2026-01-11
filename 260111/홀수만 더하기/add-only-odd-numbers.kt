fun main() {
    val n = readln().toInt()
    val sum = List(n) { readln().toInt() }
        .filter { it % 2 == 1 && it % 3 == 0 }
        .sum()

    println(sum)
}