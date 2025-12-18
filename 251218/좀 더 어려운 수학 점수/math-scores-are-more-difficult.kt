import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (mathA, englishA) = readLine().split(" ").map { it.toInt() }
    val (mathB, englishB) = readLine().split(" ").map { it.toInt() }

    val winner = when {
        mathA > mathB -> "A"
        mathA < mathB -> "B"
        englishA > englishB -> "A"
        else -> "B"
    }

    println(winner)
}