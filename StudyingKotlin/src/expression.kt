fun main() {
    val a = 2
    val b = 5

    var maxValue:Int = if(a > b) {
        println("a is greater")
        a
    }else {
        println("b is greater")
        b
    }

    println(maxValue)


    // WHEN EXPRESSION
    val x = 3

    when (x) {
        !in 1..100 -> println("x lies in 1 to 3")
        0, 1 -> println("x is o OR 1")
        2 -> println("x is 2")
        in 3..20 -> println("x lies in 3 to 20")
        else -> {
            println("x value is unknown")
            println("I don't know what is x")
        }
    }

    var str:String
    when (x) {
        0, 1 -> str = "x is o OR 1"
        2 -> str = "x is 2"
        in 3..20 -> str = "x lies in 3 to 20"
        else -> {
            str = "x value is unknown"
            println("I don't know what is x")
        }
    }

    println(str)

    var strt:String = when (x) {
        0, 1 ->"x is o OR 1"
        2 -> "x is 2"
        in 3..20 -> "x lies in 3 to 20"
        else -> {
            "x value is unknown"
        }
    }

    println(strt)
}