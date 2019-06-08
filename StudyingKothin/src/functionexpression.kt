fun main(){
    var largeValue = max(4, 6)
    println("The greater number is $largeValue")
}

fun max(a: Int, b:Int):Int
        = if (a > b) {
            println("$a is greater")
            a
        } else {
            println("$b is greater")
            b
        }


// fun max(a:Int, b:Int):Int = if(a > b) a else b

/*fun max(a:Int, b:Int):Int {

 if(a > b)
     return a
 else
     return b
}*/
