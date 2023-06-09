package KotlinCollection

fun main() {
    val list1 = listOf(1, 1, 2, 3, 5, 8, -1)
    val list2 = setOf(1, 1, 2, 2, 3, 5)
    val list3 = mutableListOf(6, 7)

    val intersect = list1 intersect list2
    val union = list1 union list2 union list3

    println(intersect)
    println(union)
}