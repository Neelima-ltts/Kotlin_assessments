package com.example.kotlin_assessment1

import java.util.*

fun main()
{
    var sum = 0

    var sc = Scanner(System.`in`)
    println("Enter Quantity")
    var a = sc.nextInt()
    println("Enter Price for Unit")
    var b = sc.nextInt()

    println("Bill is  ${a  * b} ")
    var bill = a * b
    var discountedAmount  =  0.15 * bill
    println(discountedAmount)
    var billAfterDiscount = (a * b) - discountedAmount

    println("Bill after discount is  $billAfterDiscount")

}