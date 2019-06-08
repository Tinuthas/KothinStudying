package com.mykotlin

fun main(){

}

abstract class Persons {
    abstract var name:String

    abstract fun eat() // abstract properties are "open" by default
    open fun getHeight() {}
    fun goToSchool(){}
}

class Indians : Persons(){
    override var name: String = "dummy+indian_name"

    override fun eat() { // Code implement

    }


    override fun getHeight() {

    }
}