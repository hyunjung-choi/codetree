import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var a = br.readLine().toInt()

    if (a % 2 == 0) a /= 2
    if (a % 2 != 0) a = (a + 1) / 2

    println(a)
}