package com.array

fun main() {

    // Set contains unique elements

    var mySet = setOf<Int>(2,43,54 ,3, 1, 0, 9, 9, 9, 8) // Immutable, READ Only

    for (elemet in mySet)
        println("Element: $elemet")
    println()

    var mySetMun = mutableSetOf<Int>(2,43,54 ,3, 1, 0, 9, 9, 9, 8) // Immutable, READ Only
    var mySetHash = hashSetOf<Int>(2,43,54 ,3, 1, 0, 9, 9, 9, 8) // Immutable, READ Only
    // HashSet sequence is not guaranteed in output
    mySetMun.remove(54)
    mySetMun.add(100)

    for (elemet in mySetHash)
        println("Element: $elemet")
    println()


    /*for(index in 0 until list.size)
        println(list[index])*/
}
