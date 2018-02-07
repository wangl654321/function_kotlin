package com.wang

fun main(args: Array<String>) {
	var i = { a: Int, b: Int -> a * b }
	var a = i(6, 9);
	println(a);
	
	var j:(Int,Int)->Int = {x,y -> x+y}
	var cc = j(7,9);
	println(cc);
}

fun add(a: Int, b: Int): Int {
	return a + b;
}

fun add1(a: Int, b: Int): Int = a * b
