fun main() {
    val students = mapOf(1 to "John", 2 to "Tom", 3 to "Paul", 4 to "Sam")

    generateSequence(::readln)
        .map(String::toInt)
        .forEach { num ->
            students[num]?.let { println(it) } ?: run {
                println("Vacancy")
                return
            }
        }
}
