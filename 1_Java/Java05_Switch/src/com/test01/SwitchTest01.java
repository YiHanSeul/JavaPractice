package com.test01;

import java.util.Scanner;

public class SwitchTest01 {
	public void test() {
		int i = 2;

		switch (i) {
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		default:
			System.out.println("1,2,3 모두아닙니다.");
		}

		char ch = 'd';

		switch (ch) {
		case 'a':
			System.out.println("a입니다.");
			break;
		case 'b':
			System.out.println("b입니다.");
			break;
		case 'c':
			System.out.println("c입니다.");
			break;
		default:
			System.out.println("a,b,c 모두아닙니다.");
			
		}
		
		String s="삔";
		switch(s) {
		case "밥":
			System.out.println("밥이다");
			break;
		case "빵":
			System.out.println("빵이다.");
			break;
		case "고기":
			System.out.println("고기다");
			break;
		default :
			System.out.println("물");
		}
		
		int no =2;
		switch(no) {
		case 1 :
		case 3 :
			System.out.println("홀수입니다.");
			break;
		case 2 :
		case 4 :
			System.out.println("짝수입니다.");
			break;
		default :
			System.out.println("다른숫자!");
		}
		
	}
	public void test2() {
		//키보드로 정수 하나 입력
		Scanner input = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		int month =input.nextInt();
		
		switch(month) {
		case 12 :
		case 1 :
		case 2 :
			System.out.println("겨울");
			break;
		case 3 :
		case 4 :
		case 5 :
			System.out.println("봄");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println("여름");
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println("가을");
			break;
		default :
			System.out.println("없는 달입니다.");
		}
	}
	public void test3() {
		// 정수 두개와 연산기호(+,-,*,/)1개를 입력받아
		//	연산기호에 해당하는 계산을 수행하고 출력
		Scanner input = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력하세요");
		int num1 = input.nextInt();
		
		System.out.println("두번째 숫자 입력하세요");
		int num2 =input.nextInt();
		
		System.out.println("연산기호를 입력하세요");
		char giho =input.next().charAt(0);
		
		switch(giho) {
		case '+':
			System.out.println(num1+" + "+num2 +" = " +(num1+num2));
			break;
		case '-':
			System.out.println(num1+" - "+num2 +" = " +(num1-num2));
			break;
		case '*':
			System.out.println(num1+" x "+num2 +" = " +(num1*num2));
			break;
		case '/':
			System.out.println(num1+" / "+num2 +" = " +(num1/num2));
			break;
		default :
			System.out.println("연산기호가 틀렸습니다.");
		}
		
	}
}
