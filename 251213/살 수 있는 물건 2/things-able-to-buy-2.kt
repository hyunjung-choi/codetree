import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val money = br.readLine().toInt()

    println(
        when (money) {
            in 3000..10000 -> "book"
            in 1000..2999 -> "mask"
            in 500..999 -> "pen"
            else -> "no"
        })
}