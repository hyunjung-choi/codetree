import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (h, w) = br.readLine().split(" ").map { it.toInt() }
    val bmi = (w / (h / 100.0 * h / 100.0)).toInt()
    println(if (bmi >= 25) "$bmi\nObesity" else "$bmi")
}
