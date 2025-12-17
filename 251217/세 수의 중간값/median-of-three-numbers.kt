import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (a, b, c) = readLine().trim().split(" ").map { it.toInt() }
    println(if (b > a && b < c) 1 else 0)
}