import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (mid, final) = readLine().split(" ").map { it.toInt() }

    val scholarship = when {
        mid >= 90 && final >= 95 -> 100_000
        mid >= 90 && final >= 90 -> 50_000
        else -> 0
    }

    println(scholarship)
}