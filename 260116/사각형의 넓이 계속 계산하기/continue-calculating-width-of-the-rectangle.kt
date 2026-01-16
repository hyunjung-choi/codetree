fun main() {
    generateSequence(::readln)
        .map { it.split(" ") }
        .forEach {
            val area = it[0].toInt() * it[1].toInt()
            println(area)
            if (it[2] == "C") return
        }
}

