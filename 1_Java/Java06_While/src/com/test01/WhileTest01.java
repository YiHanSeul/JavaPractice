package com.test01;

import java.util.Scanner;

public class WhileTest01 {
	Scanner input =new Scanner(System.in);
	public static void main(String[] args) {
//		new WhileTest01().testWhile();
//		new WhileTest01().testWhile2();
//		new WhileTest01().testWhile3();
		new WhileTest01().testWhile4_1();
	}
	public void testWhile() {
		int i =0;
		while(i<8) {
			System.out.println(i+1);
			i++;
		}
	}
	public void testWhile2() {
		System.out.println("문자열 입력");
		String s= input.nextLine();

		int index=0;
		while(index <s.length())
		{
			char ch =s.charAt(index);
			System.out.println(index +":"+ch);
			index++;
		}
	}
	public void testWhile3() {

		System.out.println("숫자를 입력하세요");
		int num =input.nextInt();
		
		int i=1;
		int sum=0;
		while(i<=num) {
			sum +=i;
			i++;
		}
		System.out.println(num+"의 합은 :"+sum);
	}
	public void testWhile4() {
		int i =1;
		while(true) {
			System.out.println(i);
			i++;
			
			if(i==10) {
				break;
			}
		}
	}
	public void testWhile4_1() {
		while(true) {
			System.out.println("숫자를 입력하세요");
			int i =input.nextInt();
			if(i==4) {
				System.out.println("숫자 4 임");
				break;
			}
		}
	}
}
