import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val a = readLine().toInt()

    println((a % 2 != 0 && a % 3 == 0) || (a % 2 == 0 && a % 5 == 0))
}