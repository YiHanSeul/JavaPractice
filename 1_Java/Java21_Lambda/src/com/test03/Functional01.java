package com.test03;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Functional01 {
	public static void main(String[] args) {
		unaryTest();
		binaryTest();
	}

	public static void unaryTest() {
		// UnaryOperator :매개변수 인자 하나, 동일한 type 객체를 리턴
		// apply()
		UnaryOperator<String> hello = (name) -> "Hello," + name;
		System.out.println(hello.apply("Lambda"));

	}

	public static void binaryTest() {
		BinaryOperator<Integer> sum = (i, j) -> i + j;
		System.out.println(sum.apply(10, 3));
		
		//apply가 먼저 실행되고 나오는 값을가지고  andThen이 실행됨 
		System.out.println(sum.andThen((n) -> n * 2).apply(10, 30));
	}
}
