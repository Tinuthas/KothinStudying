package com.lambdas


// val myLambdaFunc: (Int, Int) -> Int = {x, y -> x + y}
// fun addTwoNum(a:Int, b:Int, myFunc: (Int, Int) -> Int)

fun main() {
    val program = Program()
    program.addTwoNumbers(2,7)
    program.addTwoNumbers(2,7,  object : MyInterface{
        override fun execute(sum: Int) {
            println(sum)
        }
    })

    var test: String = "Hello"

    val myLambda:(Int) -> Unit = {s: Int -> println(s)} // LAMBDA EXPRESSION [FUNCTION]
    program.addTwoNumbers(2, 7, myLambda)

    //val myOtherLambda: (Int, Int) -> Int = { x: Int, y: Int -> x + y}
    //program.addTwoNumbers(2, 7, { x, y -> x + y})
    program.addTwoNumbers(2, 7) { x, y -> x + y}

    var result:Int = 0
    program.addTwoNumbers(2, 7, 0) { x, y, z -> result = x + y + z}
    println(result)

    // it reference itself
    //program.reverseAndDisplay("Hello") { s -> s.reversed()}
    program.reverseAndDisplay("Hello") { it.reversed()}

}

class Program {

    fun addTwoNumbers(a:Int, b:Int, c:Int, action: (Int, Int, Int) -> Unit) { // LAMBDA HIGH LEVEL FUNCTION
        action(a, b, c) // x + y = a + b = 2 + 7 = 9
    }

    fun addTwoNumbers(a:Int, b:Int, action: (Int, Int) -> Int) { // LAMBDA HIGH LEVEL FUNCTION
        var sum = a + b
        var result = action(a, b) // x + y = a + b = 2 + 7 = 9
        println(result)
    }

    fun addTwoNumbers(a:Int, b:Int, action: (Int) -> Unit) { // LAMBDA HIGH LEVEL FUNCTION
        var sum = a + b
        action(sum)
    }

    fun addTwoNumbers(a:Int, b:Int, action: MyInterface) {
        var sum = a + b
        action.execute(sum)
        println(sum)
    }

    fun addTwoNumbers(a:Int, b:Int) {
        var sum = a + b
        println(sum)
    }

    fun reverseAndDisplay(str:String, myFunc: (String) -> String) {
        var result = myFunc(str)
        println(result)
    }
}

interface MyInterface {
    fun execute(sum: Int)
}
