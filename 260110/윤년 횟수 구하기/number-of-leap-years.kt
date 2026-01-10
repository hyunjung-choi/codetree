import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().trim().toInt()
    var cnt = 0

    (1..n).forEach {
        if (isLeapYear(it)) cnt++
    }

    println(cnt)
}

private fun isLeapYear(n: Int): Boolean {
    return (n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)
}