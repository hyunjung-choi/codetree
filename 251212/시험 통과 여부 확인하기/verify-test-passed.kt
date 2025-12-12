import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val score = br.readLine().toInt()

    if (score >= 80) println("pass")
    else println("${80 - score} more score")
}