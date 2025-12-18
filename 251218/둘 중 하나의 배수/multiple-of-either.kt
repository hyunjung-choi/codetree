import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val a = readLine().toInt()

    println(if (a % 3 == 0 || a % 5 == 0) 1 else 0)
}