package com.test01;

import java.util.Scanner;

public class Operator06 {
	//삼항연산자
	//(조건식)? 참일때 : 거짓일때
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("정수 하나 입력");
		int num =input.nextInt();
		
		//num 양수인지, 아닌지 판단
		String str = (num > 0 )?"양수다 ": (num==0)?"0이다":"음수다";
		System.out.println(str);
	}

}
