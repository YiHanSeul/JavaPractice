package com.test.chap03.test01;

public class KindOfVariabel {//클래스 영역의 시작
	//필드 ==멤버변수(클래스가 가지는 멤버라는 의미)==전역변수
	
	private int globalNum;
	
	public void testMethod(int num) {//메소드 영역의 시작
	//메소드 영역에 작성하는 변수 => 지역변수
	//메소드 괄호 안에 선언하는 변수=> 매개변수
		int localNum;
		
		//지역 변수 선언 외에 사용하기 위해서는 반드시 초기화가 되어야한다.
		//System.out.println(localNum);
		System.out.println(num);
	}
	public void testMethod2() {
		System.out.println(globalNum);
	}
}

