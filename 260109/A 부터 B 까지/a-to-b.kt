import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (a, b) = readLine().trim().split(Regex("\\s+")).map { it.toInt() }
    var n = a
    while (n <= b) {
        if (n % 2 != 0) {
            print("$n ")
            n *= 2
        } else {
            print("$n ")
            n += 3
        }
    }
}