import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigDecimal
import java.math.RoundingMode

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (a, b) = readLine().trim().split(Regex("\\s+")).map { it.toInt() }
    val result = BigDecimal(a).divide(BigDecimal(b), 20, RoundingMode.FLOOR)
    println(result)
}