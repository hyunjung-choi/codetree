import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (a, n) = readLine().trim().split(Regex("\\s+")).map { it.toInt() }
    var result = a
    repeat (n) { 
        result += n
        println(result)
    }
}