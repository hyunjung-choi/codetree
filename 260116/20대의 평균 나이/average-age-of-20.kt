fun main() {
    val ages = generateSequence(::readln)
        .map(String::toInt)
        .takeWhile { it in 20..29 }
        .toList()

    println(String.format("%.2f", ages.average()))
}
