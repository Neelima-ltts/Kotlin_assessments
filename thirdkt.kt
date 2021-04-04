package com.example.kotlin_assessment1

import java.util.*

fun main(args : Array<String>){
    val sc = Scanner(System.`in`)
    println("Enter subject 1 marks..")
    var sub1 = sc.nextInt()
    println("Enter subject 2 marks..")
    var sub2 = sc.nextInt()
    println("Enter subject 3 marks..")
    var sub3 = sc.nextInt()
    var total = sub1 + sub2 + sub3
    var per  = total/3
    println("Total is : $total")
    println("Percentage is : $per"+"%")
}