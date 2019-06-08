package com.mykotlin

fun main(){
    var student = Studentas("Sriyank", 10, true)

    println(student.id )
}

class Studentas(var name: String){

    var id:Int = -1

    var tipe:Boolean = false

    init {
        println("Student has got a name as $name and id is $id")
    }

    constructor(n: String, id: Int): this(n){
        // The body of the Secindary constructor is called after the init block
       this.id = id
    }

    constructor(n: String, id: Int, tipe:Boolean ): this(n, id){
        this.id = id
    }

}
