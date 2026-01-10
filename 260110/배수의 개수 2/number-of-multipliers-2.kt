import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var cnt = 0

    repeat(10) {
        val number = readLine().trim().toInt()
        if (number % 2 == 1) {
            cnt++
        }
    }

    println(cnt)
}