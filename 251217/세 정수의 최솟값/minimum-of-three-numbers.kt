import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (a, b, c) = readLine().split(" ").map { it.toInt() }

    val minValue = minOf(a, b, c)
    
    println(minValue)
}