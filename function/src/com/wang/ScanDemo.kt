package com.wang

fun main(args: Array<String>) {
	println("������һ������");
	var num = readLine();

	println("�������������");
	var num2 = readLine();

	// !! ��ʾȷ����Ϊ��
	var a:Int = num!!.toInt();
	// ? ��ʾ����Ϊ��
	var b = num2?.toInt();
	println("${num} + ${num2} = " + a + b);
}



