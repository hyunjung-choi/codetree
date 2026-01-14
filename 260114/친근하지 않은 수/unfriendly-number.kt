fun main() {
    val n = readln().toInt()
    println((1..n).filter{ it % 2 != 0 && it % 3 != 0  && it % 5 != 0 }.size)
}
