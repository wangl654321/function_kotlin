package com.wang

fun main(args: Array<String>) {
	println("请输入一个数字");
	var num = readLine();

	println("请输入二个数字");
	var num2 = readLine();

	// !! 表示确定不为空
	var a:Int = num!!.toInt();
	// ? 表示可以为空
	var b = num2?.toInt();
	println("${num} + ${num2} = " + a + b);
}



