import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (a, b, c) = readLine().trim().split(Regex("\\s+")).map { it.toInt() }
    println(a + b + c - maxOf(a, b, c) - minOf(a, b, c))
}