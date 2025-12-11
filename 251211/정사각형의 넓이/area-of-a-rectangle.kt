import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toDouble()
    println(if (n < 5) "${n.pow(2).toInt()}\ntiny" else "${n.pow(2).toInt()}")
}