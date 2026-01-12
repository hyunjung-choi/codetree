fun main() {
    val n = readln().trim().toInt()
    val numbers = List(n) { readln().trim().toInt() }

    val sum = numbers.sum()
    val average = numbers.average()

    println("%d %.1f".format(sum, average))
}