import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val student = br.readLine().toInt()

    val students = listOf("John", "Tom", "Paul")
    println(students.getOrElse(student - 1) { "Vacancy" })
}
