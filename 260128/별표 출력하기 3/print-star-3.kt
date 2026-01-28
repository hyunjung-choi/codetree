fun main() {
    val n = readln().toInt()

    for (i in 1..n) {
        repeat(2 * (i - 1)) {
            print(" ")
        }

        repeat(2 * (n - i + 1) - 1) {
            print("* ")
        }

        println()
    }
}
