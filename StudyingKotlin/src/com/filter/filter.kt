package com.filter

// FILTER -> Returns a list containing only elements matching the given [predicate]
// MAP -> Returns a list containing the results of applying the given [transform] function

fun main () {
    val myNumbers: List<Int> = listOf(10, 9, 8, 23, 90)

    val mySmallNums: List<Int> = myNumbers.filter { it < 10 } // v -> v < 10

    for (num in mySmallNums)
        println(num)

    println()

    val mySquaredNums = myNumbers.map { it * it } // num -> num * num
    for (num in mySquaredNums)
        println(num)

    println()

    val mySmallSquaredNums = myNumbers.filter { it < 10 }
                                        .map { it * it }
    for (num in mySmallSquaredNums)
        println(num)

    println()

    var people = listOf<PersonArray>(PersonArray(10, "Sriyank"), PersonArray(23, "Annie"),
        PersonArray(17, "Sam"))
    var names = people.filter { it.nome.startsWith("S") }
                        .map { it.nome } // p -> p.nome // person ->  person.nome.startsWith("S")
    for(name in names)
        println(name)


}


class PersonArray(var age: Int, var nome: String){

}