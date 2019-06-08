package com.filter

fun main() {

    val myNumbers = listOf(2, 3, 4, 6, 23, 90)

    val myPredicate = {num:Int -> num > 10}

    val check1 = myNumbers.all { it > 10 } // num -> num > 10
    println(check1)

    val check2 = myNumbers.any {it > 10} // boolean
    println(check2)

    val totalCount = myNumbers.count{it > 10/*myPredicate*/} // Count numbers
    println(totalCount)

    val num: Int? = myNumbers.find { it > 10 } // The first number
    println(num)


}