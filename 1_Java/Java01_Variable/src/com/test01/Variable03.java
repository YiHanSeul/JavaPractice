package com.test01;

import java.util.Scanner;

public class Variable03 {
	// 변수 선언 & 초기화
	// 키보드로 입력받아 변수에 저장된 값 변경
	public static void main(String[] args) {
		
		
		String name = "YiHanseul";
		char gender='W';
		int age=24;
		
		System.out.println("name : " + name);
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);

		Scanner input = new Scanner(System.in);
		
		System.out.print("이름 입력: ");
		name = input.nextLine();
		
		System.out.print("성별 입력: ");
		gender = input.next().charAt(0);

		
		System.out.print("나이 입력 ");
		age =input.nextInt();
		
		System.out.println("이름 : "+name +"\n성별 : " + gender +"\n나이 : "+age);
	}
}
