import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().trim().toInt()
    var i = 1
    
    while (i <= n) {
        print("$i ")
        i += 1
    }
}