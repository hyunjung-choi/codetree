import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var countOf3 = 0
    var countOf5 = 0

    repeat(10) {
        val number = readLine().trim().toInt()
        if (number % 3 == 0) {
            countOf3++
        }
        if (number % 5 == 0) {
            countOf5++
        }
    }

    println("$countOf3 $countOf5")
}