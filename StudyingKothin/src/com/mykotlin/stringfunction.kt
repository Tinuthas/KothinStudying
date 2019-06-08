@file:JvmName("TesteKothin")
package com.mykotlin

import com.java.TesteJava


fun main() {
    val str1:String = "Hello"
    val str2:String = "World"
    val str3:String = "Hey "

    println(str3.add(str1, str2))

    //TesteJava.mostrar(str3)

    val x:Int = 6
    val y:Int = 10
    println(x.greaterValue(y))

    // example infix
    println(x greaterValue y) // x.greaterValue(y)

}

fun String.add(s1: String, s2: String):String {
    return this + s1 + s2
}

infix fun Int.greaterValue(other:Int):Int { // Infix Function and also Extension function
    return if(this > other)
        this
    else
        other
}
