package KotlinCollection

fun main() {
    val numberList = listOf(1, 2, 3, 4, 5)

    val multipliedBy5 = numberList.map { it * 5 }
    print(multipliedBy5)
}