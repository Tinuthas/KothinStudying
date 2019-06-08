package com.array

fun main() {

    var myArray = Array<Int>(5){ 0 } // Mutable. Fixed Size
    myArray[0] = 32
    myArray[3] = 54
    myArray[1] = 10

    //println(myArray[3])
    for (element in myArray)
        println(element)

    /*for(index in 0..myArray.size - 1)
        println(index)*/

    println()

    for(index in 0 until myArray.size)
        println(index)
    println()
                                //0     //1         //2
    var list = listOf<String>("Yogi", "Manmohan", "Vajpayee") //Immutable, Fixes Size, READ ONLY
    for (element in list)
        println(element)
    println()
    for(index in 0 until list.size)
        println(list[index])

    println()
    var listMutable = mutableListOf<String>() //Mutable, No Fixes Size, Can add or remove elements
    listMutable.add("Yogi")
    listMutable.add("Manmohan")
    listMutable.add("Vajpayee")
    listMutable.add("Juifuri")

    listMutable.remove("Yogi")
    for (element in listMutable)
        println(element)
    println()
    for(index in 0 until listMutable.size)
        println(listMutable[index])

    // MUTABLE
    var listMut = mutableListOf<String>()
    var listArrayOf = arrayListOf<String>()
    var listArray = ArrayList<String>()

}