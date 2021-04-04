package com.example.kotlin_assessment1


import java.util.*

fun leapYear(y: Int): Boolean {
    return ((y % 400) == 0)
            || (((y % 4) == 0) && ((y % 100) != 0))
}
fun main() {

    val sc = Scanner(System.`in`)

    println("Enter Year:")
    val year = sc.nextInt()

    val res = if(leapYear(year)) {
        "Given year is a leap year."
    } else {
        "Given year is not a leap year."
    }

    println(res)
}
