package com.mykotlin

// public default
// private
// protected
// internal

private fun run(){

}

class TestClass() {

    // person.a, person.b are not visible
    // person.c, person.d are visible

    fun testing() {
        var person = Person()
        println(person.c)
    }
}

private open class Person{ // Super class
    private val a = 1
    protected val b = 2
    internal val c = 3
    val d = 10
}

private class Indian: Person() {
    // a is not visible
    // b, c, d is visible
    fun teste() {
        println(c)
    }
}