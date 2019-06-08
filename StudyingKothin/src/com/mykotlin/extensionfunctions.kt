package com.mykotlin

fun main(){
    var student = Student()
    println("Pass status: " + student.hasPassed(57))
    println("Sholarship Status: " + student.isScholar(57))
}

fun Student.isScholar(marks:Int):Boolean {
    return marks > 95
}

class Student {
    fun hasPassed(marks: Int):Boolean {
        return  marks > 40
    }
}