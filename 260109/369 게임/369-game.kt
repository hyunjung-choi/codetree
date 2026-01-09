fun main() {
    val n = readln().toInt()

    val result = (1..n).joinToString(" ") { number ->
        if (isClap(number)) "0" else number.toString()
    }

    println(result)
}

fun isClap(number: Int): Boolean {
    val numberStr = number.toString()
    return number % 3 == 0 ||
           numberStr.contains('3') ||
           numberStr.contains('6') ||
           numberStr.contains('9')
}