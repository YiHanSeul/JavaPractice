package com.example;

import java.util.Scanner;

public class Example {
	public void example1() {
		Scanner input = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요");
		int num1 = input.nextInt();
		System.out.print("두번째 정수를 입력하세요");
		int num2 = input.nextInt();

		System.out.println("더하기 결과 :" + (num1 + num2));
		System.out.println("빼기 결과 :" + (num1 - num2));
		System.out.println("곱하기 결과 :" + (num1 * num2));
		System.out.println("나누기 몫 :" + (num1 / num2));
		System.out.println("나누기한 나머지 :" + (num1 % num2));
	}
	
	public void example2() {
		Scanner input =new Scanner(System.in);
		System.out.println("가로입력 : ");
		double weight = input.nextDouble();
		System.out.println("세로입력 : ");
		double height = input.nextDouble();
		
		System.out.println("면적 : "+ weight*height);
		System.out.println("둘레 : "+ (weight+height)*2);
	}
	
	public void example3() {
		Scanner input =new Scanner(System.in);
		System.out.print("문자열을 입력하시오 :");
		String a=input.nextLine();
		System.out.println("첫번째 문자 : " + a.charAt(0));
		System.out.println("두번째 문자 : " + a.charAt(1));
		System.out.println("세번째 문자 : "+a.charAt(2));
		System.out.println("입력된 글자 갯수 : " + a.length());
		
	}
}
