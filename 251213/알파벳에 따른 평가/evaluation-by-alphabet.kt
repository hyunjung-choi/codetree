import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine()

    val result = when (input) {
        "S" -> "Superior"
        "A" -> "Excellent"
        "B" -> "Good"
        "C" -> "Usually"
        "D" -> "Effort"
        else -> "Failure"
    }
    println(result)
}