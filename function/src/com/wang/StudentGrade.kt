package com.wang

fun main(args: Array<String>) {
	println(graDent(10));
	println(graDent(9));
}

fun graDent(num: Int): String {
	when (num) {
		10 -> return "10"
		9 -> return "9"
		8 -> return "9"
		else -> return "0"
	}
}