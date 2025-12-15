import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val a = readLine().toInt()

    println(if (a % 3 == 0) "YES" else "NO")
    println(if (a % 5 == 0) "YES" else "NO")
}