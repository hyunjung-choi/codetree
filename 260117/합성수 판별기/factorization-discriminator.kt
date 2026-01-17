fun main() {
    val n = readln().toInt()

    val isComposite = (2 until n).any { n % it == 0 }

    println(if (isComposite) "C" else "N")
}
