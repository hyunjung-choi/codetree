import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, a) = readLine().trim().split(Regex("\\s+")).map { it.toInt() }
    var i = 1

    while (i <= n) {
        if (i % a == 0) println(1)
        else println(0)
        i++
    }
}