import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sight = br.readLine().toDouble()
    
    if (sight >= 1.0) println("High")
    else if (sight >= 0.5) println("Middle")
    else println("Low")
}