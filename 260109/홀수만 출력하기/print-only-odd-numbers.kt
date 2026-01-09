fun main() {
    val n = readln().toInt()

    repeat(n) {
        val number = readln().toInt()
        if (number % 2 == 1 && number % 3 == 0) {
            println(number)
        }
    }
}