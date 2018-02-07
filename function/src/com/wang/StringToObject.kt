package com.wang

fun main(args: Array<String>) {
	var str = "13";
	var num = 13;
	println(str.toInt());
	println(num.toString());

	try {
		var value = "A";
		println(value.toInt());
	} catch(e: Exception) {
		println(e);
	}

}

