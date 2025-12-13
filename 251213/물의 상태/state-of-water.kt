import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val water = br.readLine().toInt()

    if (water < 0) println("ice")
    else if (water > 100) println("vapor")
    else println("water")
}