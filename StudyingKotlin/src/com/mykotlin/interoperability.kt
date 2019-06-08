@file:JvmName("MyCustomKotlinFileName")

package com.mykotlin

import add
import com.java.MyJavaFile

fun main(){
    add(5, 7)
    var area = MyJavaFile.getArea(5,6)
    println("Printint area from Kotlin file: $area")

    var result = findVolume(length = 2, breadth = 3)
    println(result)

    var result2 = findVolume(length = 2, height = 20, breadth = 3 )
    println(result2)
}

fun addSum(a:Int, b:Int):Int {
    return a + b
}

@JvmOverloads
fun findVolume(length:Int, breadth:Int, height:Int = 10):Int{
    println("Length is $length")
    println("Breadth is $breadth")
    println("Height is $height")
    return length * breadth * height
}