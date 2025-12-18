import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val a = readLine().toInt()

    println(if (a !in 10..20) "yes" else "no")
}
