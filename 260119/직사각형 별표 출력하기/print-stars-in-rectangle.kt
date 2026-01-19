fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    
    repeat(n) {
        repeat(m) {
            print("* ")
        }
        println()
    }
}