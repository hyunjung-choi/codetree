import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var a = br.readLine().toInt()

    if (a == 5) println("A")
    if (a % 2 == 0) println("B")
}