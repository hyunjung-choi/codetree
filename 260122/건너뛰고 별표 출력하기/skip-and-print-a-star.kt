fun main() {
    val n = readln().toInt()
    val sb = StringBuilder()

    for (i in 1..n) {
        sb.append("*")
        println(sb)
        println()
    }

    for (i in n - 1 downTo 1) {
        sb.setLength(sb.length - 1)
        println(sb)
        println()
    }
}
