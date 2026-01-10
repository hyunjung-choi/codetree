fun main() {
    var cnt = 0

    repeat(5) {
        val number = readln().toInt()
        if (number % 2 == 0) cnt++
    }

    println(cnt)
}