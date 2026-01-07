import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (c, n) = readLine().trim().split(Regex("\\s+"))
    val num = n.toInt()

    when (c) {
        "A" -> println((1..num).joinToString(" "))
        "D" -> println((num downTo 1).joinToString(" "))
        else -> println("Invalid Command")
    }
}