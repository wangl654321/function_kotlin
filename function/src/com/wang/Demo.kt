package com.wang

fun main(args: Array<String>) {

	var value = ollAdd(500);
	//println(value);

	var value2 = ollAddTwo(100000, 0);
	println(value2);
}

fun ollAdd(a: Int): Int {
	if (a == 1) {
		return 1
	} else {
		//µÝ¹é²Ù×÷
		return a + ollAdd(a - 1);
	}
}

//Î²µÝ¹éÓÅ»¯
tailrec fun ollAddTwo(a: Int, b: Int): Int {

	println(" b = ${b}");
	if (a == 1) {
		return 1
	} else {
		//µÝ¹é²Ù×÷
		return ollAddTwo(a - 1, b + a);
	}
}