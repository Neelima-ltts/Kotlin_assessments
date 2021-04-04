package com.example.kotlin_assessment1

import java.util.*

fun main(args : Array<String>){
    val sc = Scanner(System.`in`)
    println("Enter a")
    var a : Int = sc.nextInt()
    println("Enter b")
    var b : Int = sc.nextInt()
    println("Enter option from 1 to 4..")
    var number = sc.nextInt()

    var numberProvided = when(number) {
        1 -> System.out.printf("Addition : %d" , a+b)
        2 -> System.out.printf("Subtraction : %d" , a-b)
        3 -> System.out.printf("Multiplication : %d" , a*b)
        4 -> System.out.printf("Division : %d" , a/b)
        else -> "invalid number"
    }
}