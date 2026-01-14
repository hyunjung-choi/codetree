fun main() {
    val n = readln().toInt()
    println((1..n).filter {
        it % 2 != 0 &&
                it % 10 != 5 &&
                !(it % 3 == 0 && it % 9 != 0)
    }.joinToString(" "))
}
