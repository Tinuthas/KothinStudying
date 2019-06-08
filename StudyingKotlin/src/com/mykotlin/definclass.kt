package com.mykotlin

fun main(){
    var student = Students("Sriyank")

    println("Student has got a name as ${student.name}")
}

class Students( var name: String) {
    //var name: String = "dummy"

    init {
        //this.name = _name
        println("Student has got a name as $name")
    }
}
