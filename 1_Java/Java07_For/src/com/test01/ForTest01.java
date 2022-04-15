package com.test01;

import java.util.Random;
import java.util.Scanner;

public class ForTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// testFor();
//		testFor2();
//		testFor3();
//		testFor4();
//		testFor5();
		testFor6();

	}

	public static void testFor() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

	public static void testFor2() {
		for (int i = 100; i > 0; i--) {
			System.out.print(i + " ");
			if (i % 10 == 1)
				System.out.println();

		}
	}

	public static void testFor3() {
		int i = 1;
		for (;;) {
			System.out.println(i + " ");
			i++;

			if (i < 10) {
				break;
			}
		}
	}

	public static void testFor4() {

		Scanner input = new Scanner(System.in);
		System.out.println("양의정수 1~9 사이값을 입력하세요");
		int num = input.nextInt();
		if (num > 0 && num < 10) {
			for (int i = 0; i < 10; i++) {
				System.out.printf("%d X %d = %d\n", num, i, num * i);
			}
		} else {
			System.out.println("숫자가 틀렸습니다.");
		}
	}

	public static void testFor5() {
		int num = (int) (Math.random() * 100) + 1; //+1을 해줘야지 1~100
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println("난수의 값 : " + num + " 난수의 합 :" + sum);
	}
	public static void testFor6() {
		Scanner input = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		int max =input.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int min=input.nextInt();
		int sum=0;
		
		if(max<min) {
			int temp;
			temp =max;
			max=min;
			min=temp;
		}
		for(int i=min;i<=max ;i++) {
			 sum +=i;
			
		}
		System.out.println("작은수 : "+ min +"에서 큰수 : "+max +"까지 더한 값은 :"+sum);
		
	}
}
