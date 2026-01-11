fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }
    val numbers = (a..b).filter { it % 5 == 0 || it % 7 == 0 }
    val sum = numbers.sum()
    val average = sum.toDouble() / numbers.size

    println("$sum %.1f".format(average))
}
