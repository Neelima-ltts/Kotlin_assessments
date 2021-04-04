package com.example.kotlin_assessment1

import java.util.*

fun main(args : Array<String>){
    val sc = Scanner(System.`in`)
    println("Enter a Number..")
    var n = sc.nextInt()
    var num1 = 0
    var num2 = 1

    print("First $n terms: ")

    for (i in 1..n) {
        print("$num1  ")

        val sum = num1 + num2
        num1 = num2
        num2 = sum
    }
}