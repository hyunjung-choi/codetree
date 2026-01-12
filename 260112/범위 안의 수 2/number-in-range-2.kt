fun main() {
    val numbers = List(10) { readln().toInt() }
        .filter { it in 0..200 }

    val sum = numbers.sum()
    val average = numbers.average()

    println("%d %.1f".format(sum, average))
}