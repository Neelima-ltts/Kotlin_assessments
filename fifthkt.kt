package com.example.kotlin_assessment1

import java.util.*

fun main(args: Array<String>){
    val sc = Scanner(System.`in`)

    print("Enter the nth Number : ")
    val n: Int = sc.nextInt()
    val myLambda: (Int) -> Unit= {s: Int -> println(s) } //lambda function
    fact(n,myLambda)
}
fun fact(a: Int, mylambda: (Int) -> Unit ){
    var n=1//high level function lambda as parameter
    for(i in 1..a){n=n*i}
    mylambda(n) 
}