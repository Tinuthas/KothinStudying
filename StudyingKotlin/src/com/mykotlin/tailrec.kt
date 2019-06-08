package com.mykotlin

import java.math.BigInteger

fun main() {
    println(getFiboracciNumber(10000, BigInteger("1"), BigInteger("0")))
}

tailrec fun getFiboracciNumber(n:Int, a:BigInteger, b:BigInteger): BigInteger {
    return if(n == 0)
        b
    else
        getFiboracciNumber(n - 1, a + b, a)
}