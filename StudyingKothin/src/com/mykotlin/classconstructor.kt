package com.mykotlin

fun main(){

    var dog = Dogs("Black", "Pug")

}


open class Animals { // Super Class
    /*init {
        println("From Animal Init: $color")
    }*/
    var color: String = ""
    constructor(color: String){
        this.color = color
        println("From Animal: $color")
    }
}

class Dogs:Animals { // Derived Class
    /*init {
        println("From Dog Init: $color and $breed")
    }*/
    var breed: String = ""
    constructor(color: String, breed: String): super(color){
        this.breed = breed
        println("From Dogs: $color and $breed")
    }
}
