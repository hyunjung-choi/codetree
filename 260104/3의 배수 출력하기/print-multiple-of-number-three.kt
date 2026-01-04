import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().trim().toInt()
    var i = 1
    
    while (i in 1..n) {
        if (i % 3 == 0) print("$i ")
        i += 1
    }
}