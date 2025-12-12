import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val score = br.readLine().toInt()

    println(if (score == 100) "pass" else "failure")
}