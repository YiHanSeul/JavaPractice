package com.test01;

public class Variable01 {
	// 타입 변수명;
	// 변수명 = 값;
	public static void main(String[] args) {
		//준비
		// 내가 사용할 메소드가 포함되어있는 클래스명 변수명 = new 클래스명();
		Variable01 test = new Variable01();

		//실행
		// 변수명.메소드명();
		test.declareVariable();
		test.initVariable();
	}

	public void declareVariable() {
		// 숫자형
		// 정수형
		byte bnum;
		short snum;
		int inum;
		long lnum;

		// 실수형
		float fnum;
		double dnum;

		// 문자
		char ch;

		// 논리
		boolean isTrue;

		// 문자형(참조형)
		String schar;

		bnum = 1;
		snum = 2;
		inum = 4;
		lnum = 8L;

		fnum = 4.0f;
		dnum = 8.0;

		ch = 'a';
		schar = "Hello";

		isTrue = true;

		// 변수에 저장된 값 출력하기
		System.out.println("bnum의 값: " + bnum);
		System.out.println("snum의 값: " + snum);
		System.out.println("inum의 값: " + inum);
		System.out.println("lnum의 값: " + lnum);
		System.out.println("fnum의 값: " + fnum);
		System.out.println("dnum의 값: " + dnum);
		System.out.println("ch의 값: " + ch);
		System.out.println("schar의 값: " + schar);
		System.out.println("isTrue의 값 :" + isTrue);

	}

	public void initVariable() {
		// 선언과 동시에 초기화

		int inum = 4;
		double dnum = 8.0;
		char ch = 'a';
		String schar = "Hello";
		boolean isTrue = true;
		System.out.println();
		System.out.println("inum의 값 :" + inum);
		System.out.println("dnum의 값 :" + dnum);
		System.out.println("ch의 값 :" + ch);
		System.out.println("schar의 값 :" + schar);
		System.out.println("isTrue의 값 :" + isTrue);
	}
}
