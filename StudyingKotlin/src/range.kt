fun main() {
    // Ranges
    val r1 = 1..5 // This range contains the numbers 1, 2, 3, 4, 5
    val r2 = 5 downTo 1 // This range contains the numbers 5, 4, 3, 2, 1
    val r3 = 5 downTo 1 step 2 // This range contains the numbers 5, 3, 1
    val r4 = 'a'..'z'
    var isPresent = 'c' in r4
    var countDown = 10.downTo(1) // // This range contains the number 10 ,9, 8 ... 1
    var moveUp = 1.rangeTo(10) // This range contains the number 1, 2, 3, 4, 5 ... 10
    println(isPresent)
}