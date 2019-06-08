package com.lambdas

fun main() {
    var person = Person()

    with(person) {
        name = "Srivank"
        age = 23
    }//.startRun() -> Not is possible
    println(person.name)
    println(person.age)

    person.apply {
        name = "Gravons"
        age = 28
    }.startRun()

    println(person.name)
    println(person.age)
}

class Person {

    var name: String = ""
    var age: Int = -1

    fun startRun(){
        println("Now I am ready to run")
    }
}