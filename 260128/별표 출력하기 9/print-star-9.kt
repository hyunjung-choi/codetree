fun main() {
    val n = readln().toInt()

    for (i in 1..n) {
        repeat(2 * (n - i)) {
            print(" ")
        }

        repeat(2 * i - 1) {
            print("* ")
        }

        println()
    }
}
