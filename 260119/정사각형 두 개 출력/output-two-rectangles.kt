fun main() {
    val n = readln().toInt()

    printSquare(n)
    println()
    printSquare(n)
}

private fun printSquare(n: Int) {
    repeat(n) {
        repeat(n) {
            print("*")
        }
        println()
    }
}
