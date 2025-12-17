import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val left = readLine().toDouble()
    val right = readLine().toDouble()

    val result = when {
        left >= 1.0 && right >= 1.0 -> "High"
        left >= 0.5 && right >= 0.5 -> "Middle"
        else -> "Low"
    }

    println(result)
}