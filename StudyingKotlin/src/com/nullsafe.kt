package com

fun main() {

    val name: String? = null // Steve // null

    // ?.
    println("The length of name is ${name?.length}")


    // Safe Call ?.let //Execute block if name is NOT NULL
    name?.let { println("The length of name is ${name.length}") }


    // Elvis-operator ( ?: )
    val len = if(name != null)
                name.length
              else
                -1
    val length = name?.length ?: -1
    println("The length of name is $length")

    println("The length of name is ${name!!.length}")

}