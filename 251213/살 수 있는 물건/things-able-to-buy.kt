import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val money = br.readLine().toInt()

    if (money >= 3000) println("book")
    else if (money >= 1000) println("mask")
    else println("no")
}
