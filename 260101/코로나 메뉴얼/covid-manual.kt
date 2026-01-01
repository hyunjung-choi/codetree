import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var countA = 0

    repeat(3) {
        val input = readLine().trim().split(" ")
        val symptom = input[0]
        val temp = input[1].toInt()

        val category = when (symptom) {
            "Y" -> if (temp >= 37) "A" else "C"
            "N" -> if (temp >= 37) "B" else "D"
            else -> "D"
        }

        if (category == "A") countA++
    }

    println(if (countA >= 2) "E" else "N")
}