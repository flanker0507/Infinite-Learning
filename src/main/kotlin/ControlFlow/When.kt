package ControlFlow

import java.lang.IllegalArgumentException

fun main(args: Array<String>) {
    val day = 2

    when (day) {
        1 -> {
            println("First day of the week")
            println("Monday")
        }
        2 -> {
            println("Second day of the week")
            println("Tuesday")
        }
        3 -> {
            println("Third day of the week")
            println("Wednesday")
        }
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid Day. ")
    }

   /* val day = 1

    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        1 -> "Saturday"
        1 -> "Sunday"
        else -> "Invaid Day"
    }

    println(result) */

    /* val day = 2

    when (day) {
        1, 2, 3, 4, 5 -> println("Weekday")
        else -> println("Weekend")
    } */

}