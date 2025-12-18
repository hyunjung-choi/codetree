import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (ageA, genderA) = readLine().split(" ").let { it[0].toInt() to it[1] }
    val (ageB, genderB) = readLine().split(" ").let { it[0].toInt() to it[1] }

    val hasAdultMale = (ageA >= 19 && genderA == "M") || (ageB >= 19 && genderB == "M")

    println(if (hasAdultMale) 1 else 0)
}