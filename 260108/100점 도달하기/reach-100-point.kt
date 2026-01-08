import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = BufferedReader(InputStreamReader(System.`in`)).use { reader ->
    val n = reader.readLine().trim().toInt()
    (n..100).joinToString(" ") {
        when (it) {
            in 90..100 -> "A"
            in 80..89 -> "B"
            in 70..79 -> "C"
            in 60..69 -> "D"
            else -> "F"
        }
    }.let(::println)
}