import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val month = readLine().toInt()
    println(when (month) {
        2 -> 28
        4, 6, 9, 11 -> 30
        else -> 31
    })
}