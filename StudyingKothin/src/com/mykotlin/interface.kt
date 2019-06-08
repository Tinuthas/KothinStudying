package com.mykotlin

fun main(){
    var myButton = MyButton()
    myButton.onTouch()
    myButton.onClick()
}

interface MyInterfaceListener {
    var name:String

    fun onTouch()

    // public and open by default, NOT FINAL
    fun onClick() {
        println("On click Interface code: Button Clicked")
    }

}

interface MySecondInterface {
    fun onTouch() {
        println("MySecondInterface: onTouch")
    }

    fun onClick(){
        println("MySecondInterface: onClick")
    }
}

class MyButton: MyInterfaceListener, MySecondInterface {
    override var name: String = "dummy_name"

    override fun onTouch() {
        // Define your own code
        println("Button was touched")
    }

    override fun onClick() { // Optional to override
        super<MyInterfaceListener>.onClick()
        super<MySecondInterface>.onClick()
        println("Button was clicked")
    }

}