import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().trim().toInt()

    var classroomCount = 0
    var hallwayCount = 0
    var toiletCount = 0

    for (day in 1..n) {
        when {
            day % 12 == 0 -> toiletCount++
            day % 3 == 0 -> hallwayCount++
            day % 2 == 0 -> classroomCount++
        }
    }

    println("$classroomCount $hallwayCount $toiletCount")
}