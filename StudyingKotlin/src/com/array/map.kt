package com.array

fun main() {

    val myMap = mapOf<Int, String>( 2 to "Yogi", 43 to "Manmohan", 7 to "Vajpayee") // Immutable, Fixed Size, READ ONLY
    myMap

    for (key in myMap.keys)
        println("Element at Key: $key = ${myMap[key]}") // myMap.get(key)
    println()

    var myMapHash = HashMap<Int, String>() // Mutable, no Fixed Size, READ and WRITE both
    var myMapMun = mutableMapOf<Int, String>() // Mutable, no Fixed Size, READ and WRITE both
    var myMapMap = hashMapOf<Int, String>() // Mutable, no Fixed Size, READ and WRITE both
    myMapMun.put(3, "Yogi")
    myMapMun.put(43, "Manmohan")
    myMapMun.put(7, "Vajpayee")

    myMapMun.replace(43, "Modi")

    for (key in myMapMun.keys)
        println("Element at Key: $key = ${myMapMun[key]}") // myMap.get(key)
    println()


    /*for(index in 0 until list.size)
        println(list[index])*/
}

