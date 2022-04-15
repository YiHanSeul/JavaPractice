package com.test01;

public class Variable04 {

	public static void main(String[] args) {
		int age;
		final int AGE; // 상수는 대문자로 선언

		age = 19;
		AGE = 19;

		System.out.println("age: " + age);
		System.out.println("AGE: " + AGE);

		//값변경
		age =21;
		
		Variable05 test =new Variable05();
		test.testOverflow();
	}

}
