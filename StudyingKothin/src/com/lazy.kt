package com

// lazy initialization to prevent unnecessary initialization of objects
// It is initialized only once. Next time when you use it, you get the value from cache memory
// It is thread sage
val pi: Float by lazy { 3.14f }

fun main() {

    println("Some initial code...")

    val area1 = pi * 4 * 4

    val area2 = pi * 9 * 9

    println("Some more code...")

}