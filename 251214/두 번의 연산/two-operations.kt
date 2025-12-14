import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var a = br.readLine().toInt()

    if (a % 2 != 0) a += 3
    if (a % 3 == 0) a /= 3

    println(a)
}