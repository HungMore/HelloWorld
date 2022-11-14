package com.example.helloworld

import kotlin.math.max

fun main() {
    println("Hello Kotlin!")
    val a = 10
    println("a = " + a)
    val b: Int = 20
    println("b = " + b)

    var c: Int = 10
    c = c * 10
    println("c = " + c)

    val largeNumber = largeNumber(7, 8)
    println("function result: " + largeNumber)
}

fun largeNumber(num1: Int, num2: Int): Int{
    val temp =
        if(num1 > num2){
            num1
        }else{
            num2
        }
    println("largerOne: " + temp)
    return max(num1, num2)
}

fun getScore(name: String): Int{
    return when(name){
        "tom" -> 86
        "jim" -> 77
        "jack" -> 95
        "lily" -> 100
        else -> 0
    }
}

fun checkNumber(num: Number){
    when(num){
        is Int -> println("number is Int")
        is Double -> println("number is Double")
        else -> println("number not support")
    }
}

class LearnKotlin {


}