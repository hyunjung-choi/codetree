import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val year = readLine().toInt()
    val isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
    println(isLeapYear)
}