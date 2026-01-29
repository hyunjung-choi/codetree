fun main() {
    val n = readln().toInt()

    for (i in 1..n) {
        repeat((i - 1) * 2) {
            print(" ")
        }

        repeat(2 * n - 2 * i + 1) {
            print("* ")
        }

        println()
    }

    for (i in n - 1 downTo 1) {
        repeat((i - 1) * 2) {
            print(" ")
        }

        repeat(2 * n - 2 * i + 1) {
            print("* ")
        }

        println()
    }
}
