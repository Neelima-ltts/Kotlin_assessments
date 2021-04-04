package com.example.kotlin_assessment1

fun main(args: Array<String>){ 
    val sc = Scanner(System.`in`)
    var n : Int = sc.nextInt()
    var arr = Array<Int>(n)
    for(i in arr){
        arr[i] = sc.nextInt()
    }
	var lambda = {->
		var rev = arr.sorted()
		println("The Smallest Element is ${rev[0]}")
		println("The Largest Element is ${rev[arr.size-1]}")
	}
	lambda()
}