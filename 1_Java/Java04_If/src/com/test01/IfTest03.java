package com.test01;

import java.util.Scanner;


public class IfTest03 {
	Scanner input = new Scanner(System.in);

	public void test() {
		int i = 10;
		int j = 20;

		if (i > j) {
			System.out.println(i + " 은" + j + " 보다 큽니다.");
		} else if (i == j) {
			System.out.println(i + " 은" + j + " 와 같습니다.");
		} else {
			System.out.println(i + " 은" + j + " 보다 작습니다.");
		}
	}

	public void test2() {
		System.out.println("점수를 입력하세요");
		int point = input.nextInt();
		String grade = "";
		if (point >= 90 ) {
			grade ="A";
		} else if (point >= 80 && point < 90) {
			grade ="B";
		} else if (point >= 70 && point < 80) {
			grade ="C";
		} else if (point >= 60 && point < 70) {
			grade ="D";
		} else{
			grade ="F";
		}
		System.out.printf("당신의 점수는 %d 이고, 등급은 %s입니다.",point,grade);
	}
	
	public void test3() {
		//위의 문제에 각 등급별 중간 점수 이상인 경우에는 
		//등급에 "+"라는 문자를 추가하여 출력
		
		System.out.println("점수를 입력하세요");
		int point = input.nextInt();
		
		String grade = "";
		if (point >= 90 ) {
			grade ="A";
		} else if (point >= 80 ) {
			grade ="B";
		} else if (point >= 70 ) {
			grade ="C";
		} else if (point >= 60 ) {
			grade ="D";
		} else{
			grade ="F";
		}
		String buho="";
		if(point%10>=5) {
			buho="+";
			System.out.printf("당신의 점수는 %d 이고, 등급은 %s%s입니다.",point,grade,buho);
		}else {
			System.out.printf("당신의 점수는 %d 이고, 등급은 %s입니다.",point,grade);
		}
	}
}
