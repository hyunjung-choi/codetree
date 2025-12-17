import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (a, b, c) = readLine().split(" ").map { it.toInt() }

    val minValue = minOf(a, b, c)

    val first = if (a == minValue) 1 else 0
    val second = if (a == b && b == c) 1 else 0
    
    println("$first $second")
}