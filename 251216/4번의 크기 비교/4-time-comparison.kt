import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val a = readLine().toInt()
    val (b, c, d, e) = readLine().split(" ").map { it.toInt() }

    println(if (a > b) 1 else 0)
    println(if (a > c) 1 else 0)
    println(if (a > d) 1 else 0)
    println(if (a > e) 1 else 0)
}