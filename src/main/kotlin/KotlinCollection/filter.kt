package KotlinCollection

fun main() {
    val numberList = listOf(1, 2, 3, 4, 5)
    val evenList = numberList.filter { it % 2 == 0 }
    val notEventList = numberList.filterNot { it % 2 == 0 }
}