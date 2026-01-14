fun main() {
    val a = readln().toInt()
    println((1..a).filter {
        !(it % 2 == 0 && it % 4 != 0) &&
                it / 8 % 2 != 0 &&
                it % 7 >= 4
    }.joinToString(" "))
}
