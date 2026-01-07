import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (a, b) = readLine().trim().split(Regex("\\s+")).map { it.toInt() }
    if (a > 0) {
        repeat(b) { print(a) }
    }
    else println(0)
}