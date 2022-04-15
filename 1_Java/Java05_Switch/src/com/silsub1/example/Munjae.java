package com.silsub1.example;

import java.util.Scanner;

public class Munjae {
	Scanner input = new Scanner(System.in);

	public void test1() {
		System.out.println("국어 점수 입력");
		int kor = input.nextInt();
		System.out.println("영어 점수 입력");
		int eng = input.nextInt();
		System.out.println("수학 점수 입력");
		int math = input.nextInt();

		int sum = kor + eng + math;
		double avg = sum / 3.0;

		int i;
		if (avg >= 60 && (kor >= 40 && eng >= 40 && math >= 40)) {
			i = 1;
		} else {
			i = 0;
		}
		switch (i) {
		case 0:
			System.out.println("불합격");
			break;
		case 1:
			System.out.printf("국어 :%d 영어 :%d 수학 :%d 합계 :%d 평균 : %f", kor, eng, math, sum, avg);
			break;
		}
	}

	public void test2() {
		System.out.println("*** 초기 메뉴 ***");
		System.out.println("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n7. 종료");
		System.out.print("메뉴번호 입력 :");
		int i = input.nextInt();

		switch (i) {
		case 1:
			System.out.println("입력메뉴가 선택되었습니다.");
			break;
		case 2:
			System.out.println("수정메뉴가 선택되었습니다.");
			break;
		case 3:
			System.out.println("조회메뉴가 선택되었습니다.");
			break;
		case 4:
			System.out.println("삭제메뉴가 선택되었습니다.");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			break;
		default:
			System.out.println("번호가 잘못 입력되었습니다.");
			System.out.println("다시 입력하십시오");
		}

	}

	public void test3() {
		System.out.println("정수를 입력하세요");
		int i = input.nextInt();

		if (i > 0) {
			System.out.println("양수다");
		} else {
			System.out.println("양수가 아니다");
		}

	}

	public void test4() {
		System.out.println("양의 정수를 입력하세요");
		int i = input.nextInt();
		String s;

		if (i >= 0) {
			if (i % 2 == 0) {
				s = "짝수다";
				System.out.println(s);
			} else {
				s = "홀수다";
				System.out.println(s);
			}
		} else {
			System.out.println("양수 입력해주세요");
		}
	}

	public void test5() {
		System.out.println("이름 입력하세요");
		String name = input.nextLine();
		System.out.println("나이 입력하세요");
		int age = input.nextInt();
		System.out.println("키 입력하세요");
		double tall = input.nextDouble();

		if ((name != null) && (name.length() > 0) && (age > 0) && (tall > 0)) {
			System.out.println("이름 : " + name);
			System.out.println("나이 :" + age);
			System.out.println("키 : " + tall);
			System.out.printf("%s의 나이는 %d세이고, 키는 %.2f cm이다.", name, age, tall);
		} else {
			System.out.println("다시 입력하세요");
		}

	}

	public void test6() {
		System.out.println("첫번째 정수 입력");
		int n1 = input.nextInt();
		System.out.println("두번째 정수 입력");
		int n2 = input.nextInt();

		if (n1 > 0 && n2 > 0) {
			System.out.println("첫번째 정수 :" + n1);
			System.out.println("두번째 정수 :" + n2);
			System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
			System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
			System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
			System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
			System.out.printf("%d %% %d = %d ",n1,n2,n1%n2);
		} else {
			System.out.println("양의 정수 입력하세요");
		}
	}

	public void test7() {
		System.out.println("양의 정수를 입력하세요");
		int i = input.nextInt();
		if (i >= 0) {
			if (i >= 90) {
				System.out.println("A");
			} else if (i >= 80) {
				System.out.println("B");
			} else if (i >= 70) {
				System.out.println("C");
			} else if (i >= 60) {
				System.out.println("D");
			}else {
				System.out.println("F");
			}
		}else {
			System.out.println("잘못된 점수 입니다.");
		}
	}
}
