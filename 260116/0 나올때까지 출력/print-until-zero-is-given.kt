fun main() {
    generateSequence { readln().toInt() }
        .takeWhile { it != 0 }
        .forEach { println(it) }
}
