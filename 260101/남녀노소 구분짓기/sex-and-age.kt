import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (sex, age) = readLine() to readLine().toInt()
    println(when {
        sex == "0" && age >= 19 -> "MAN"
        sex == "0" -> "BOY"
        age >= 19 -> "WOMAN"
        else -> "GIRL"
    })
}