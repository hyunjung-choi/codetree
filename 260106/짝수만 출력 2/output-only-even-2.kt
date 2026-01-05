import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (b, a) = readLine().trim().split(Regex("\\s+")).map { it.toInt() }
    println((b downTo a step 2).joinToString(" "))
}