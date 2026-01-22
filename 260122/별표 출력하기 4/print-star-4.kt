fun main() {
    val n = readln().toInt()
    val sb = StringBuilder()

    for (i in 1..n) {
        sb.append("* ")
    }

    for (i in n downTo 1) {
        println(sb.toString().trimEnd())
        if (i > 1) {
            sb.setLength(sb.length - 2)
        }
    }

    for (i in 2..n) {
        sb.append("* ")
        println(sb.toString().trimEnd())
    }
}
