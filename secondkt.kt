package com.example.kotlin_assessment1

import java.util.*

fun main(args : Array<String>){
    val sc = Scanner(System.`in`)
    println("Enter Radius..")
    var rad = sc.nextDouble()
    var area : Double = 3.14 * rad * rad
    println("Area of Circle : $area")
    var peri : Double = 2 * 3.14 * rad
    println("Perimeter of Circle : $peri")
    var a : Double = peri/4
    println("Length of side of Square : $a")
}