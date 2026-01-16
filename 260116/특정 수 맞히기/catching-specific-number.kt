fun main() {
    generateSequence(::readln)
        .map(String::toInt)
        .takeWhile { it != 25 }
        .forEach { println(if (it < 25) "Higher" else "Lower") }
    println("Good")
}
