fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }
    val numbers = (a..b).filter { it % 6 == 0 && it % 8 != 0 }

    println(numbers.sum())
}