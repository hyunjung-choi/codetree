import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (mathA, englishA) = readLine().split(" ").map { it.toInt() }
    val (mathB, englishB) = readLine().split(" ").map { it.toInt() }

    println(if (mathA > mathB && englishA > englishB) 1 else 0)
}