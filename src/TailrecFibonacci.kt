package com.mykotlin

import java.math.BigInteger


fun main(args: Array<String>){

    println(getFibonacciNumber(7, BigInteger("1"), BigInteger("0")))

}


fun getFibonacciNumber(n: Int, a: BigInteger, b: BigInteger): BigInteger {

    if (n == 0)
        return belse
    return getFibonacciNumber(n -1, a + b, a)



}