import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val m = readLine().toInt()

    val season = when(m) {
        in 3..5 -> "Spring"
        in 6..8 -> "Summer"
        in 9..11 -> "Fall"
        12, 1, 2 -> "Winter"
        else -> "Invalid month"
    }

    println(season)
}