package ControlFlow

fun main() {

   /* val listInt = listOf(1, 2, null, 4, 5, null, 7)

    for (i in listInt){
        if (i == null)continue
        print(i)
    }*/

    println("Print odd numbers")
    for (i in 1..20){
        if (i % 2 == 0){
            continue
        }
        println("$i is an odd number")
    }

}