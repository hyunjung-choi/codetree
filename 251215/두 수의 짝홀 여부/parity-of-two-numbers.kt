import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (a, b) = readLine().split(" ").map { it.toInt() }

    println(if (a % 2 == 0) "even" else "odd")
    println(if (b % 2 == 0) "even" else "odd")
}