import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = BufferedReader(InputStreamReader(System.`in`)).use { reader ->
    val n = reader.readLine().trim().toInt()
    (1..n).joinToString(" ") {
        if (it % 2 == 0 || it % 3 == 0) "1" else "0"
    }.let(::println)
}