fun main() {
    val n = readln().toInt()
    val sb = StringBuilder()

    for (i in 1..n) {
        sb.append("* ")
        println(sb.toString().trimEnd())
    }

    for (i in n - 1 downTo 1) {
        sb.setLength(sb.length - 2)
        println(sb.toString().trimEnd())
    }
}
