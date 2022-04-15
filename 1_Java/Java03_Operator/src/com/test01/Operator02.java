package com.test01;

public class Operator02 {
	// ++ : 1증가
	// -- : 1감소
	public static void main(String[] args) {
		Operator02 test = new Operator02();
		test.test1();
	}

	public void test1() {
		// 전위 후위
		int age = 24;
		++age;
		System.out.println("현재 나이는?" + age);

		age++;
		System.out.println("현재 나이는?" + age);

		--age;
		System.out.println("현재 나이는?" + age);

		age--;
		System.out.println("현재 나이는?" + age);

		int a = 10;
		int b = a++;
		System.out.println("a : "+ a + ", b: "+b);
		
		int num1 =20;
		int result =num1++ *3;
		System.out.println("result : "+result);
		
		int num2 =20;
		int result2=++num2 *3;
		System.out.println("result2 : "+result2);
	}
}
