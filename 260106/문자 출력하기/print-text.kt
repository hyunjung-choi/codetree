import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val ch = readLine().trim()
    repeat(8) { print(ch) }
}