fun main() {
    val n = readln().toInt()

    val isPrime = if (n <= 1) {
        false
    } else {
        (2 until n).none { n % it == 0 }
    }

    println(if (isPrime) "P" else "C")
}
