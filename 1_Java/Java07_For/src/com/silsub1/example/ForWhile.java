package com.silsub1.example;

import java.util.Scanner;

public class ForWhile {
	Scanner input= new Scanner(System.in);
	
	public void printStar1() {
		System.out.println("숫자입력");
		int n =input.nextInt();
		
		for(int i=1; i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}
			System.out.print(i);
			System.out.println();
		}
	}
	public void printStar2() {
		System.out.println("숫자를 입력하세요");
		int n=input.nextInt();
		if(n>0) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}else {
			n*=-1;
			for(int i=0;i<n; i++) {
				for(int j=0; j<n-i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
	public void countputCharacter() {
/*		문자열 값을 입력받고, 그 다음 문자 하나를 입력받아,
		   문자열 값 안에 입력문자가 몇 개 존재하는지 그 갯수를 출력함
		   단, 영문자만 입력받도록 함.
		 - 메소드명 : public void countInputCharacter(){}
			ex>
			문자열 입력 : application
			문자 입력 : p
			포함된 갯수 : 2 개
			====================
			문자열 입력 : apple_test123
			영문자가 아닙니다.*/

		System.out.println("문자열을 입력하세요");
		String st=input.nextLine();
		
		for(int i=0; i<st.length();i++) {
			char temp =st.charAt(i);
			if(!(temp>='a' && temp<='z')||(temp>='A'&&temp<='Z')) {
				System.out.println("영문자가 아닙니다.");
				return;
			}
		}
		System.out.println("문자 하나를 입력하세요");
		char ch=input.next().charAt(0);
		
		int sum =0;
	
		for(int i=0; i<st.length();i++) {
			if(ch==st.charAt(i)){
				sum++;
			}
		}
		System.out.println("sum : "+sum);
	}
}
