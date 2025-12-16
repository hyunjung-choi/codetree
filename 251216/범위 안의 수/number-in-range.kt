import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val a = readLine().toInt()

    println(if (a >= 10 && a <= 20) "yes" else "no")
}