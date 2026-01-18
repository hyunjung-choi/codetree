fun main() {
    val numbers = List(5) { readln().toInt() }

    val allMultiplesOf3 = numbers.all { it % 3 == 0 }

    println(if (allMultiplesOf3) 1 else 0)
}
