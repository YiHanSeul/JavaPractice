package com.test01;

import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class IfTest02 {

	public void test() {
		int i = 2;

		if (i < 10) {
			System.out.println(i + " 은 10보다 작습니다.");
		} else {
			System.out.println(i + " 은 10보다 크거나 같습니다.");
		}
	}
	public void test2() {
		Scanner input = new Scanner(System.in);
		int num =  input.nextInt();
		
		if(num %2 ==0){
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수 입니다.");
		}
	}
	public void test3() {
		//50보다 큰수라면 짝수인지, 홀수인지 출력
		Scanner input =new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int i =input.nextInt();
		if(i>=50){
			if(i%2==0) {
				System.out.println("50보다 큰 짝수입니다.");
			}else {
				System.out.println("50보다 작은 홀수입니다.");
			}
		}else {
			System.out.println("50보다 작다");
		}
	}
	
	public void test4() {
		//숫자 하나 입력 받아 양수인지 음수인지 출력. 단, 0이면 "0입니다" 라고 출력
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		if(i==0){
			System.out.println("0입니다.");
		}else if(i>0){
			System.out.println("양수입니다.");
		}else {
			System.out.println("음수입니다.");
		}
	}
}
