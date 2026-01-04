import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (a, b) = readLine().trim().split(Regex("\\s+")).map { it.toInt() }
    var i = a
    
    while (i <= b) {
        if (i % 2 == 0) print("$i ")
        i += 1
    }
}