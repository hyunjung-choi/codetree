fun main() {
    generateSequence(::readln)
        .map(String::toInt)
        .filter { it % 2 == 0 }
        .take(3)
        .forEach { println(it / 2) }
}
