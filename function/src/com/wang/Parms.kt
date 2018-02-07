package com.wang
fun main(args: Array<String>) {
	var i= a(2.0F,8.0F);
	println(i);
	
	var j= b(y = 8.0F);
	println(j);
}

var value = 2.5F
fun a(a:Float = value,b:Float):Float{
	return a*b;
}

fun b(x:Float = value,y:Float):Float{
	return x + y;
}

