package com.chap03.myException;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("정수 하나 입력 :");
		int no=input.nextInt();
		
		try {
			checkNum(no);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public static void checkNum(int num) throws MyException {
		if(num<10) {
			//예외발생
			//throw new MyException();
			throw new MyException(num+"은(는) 10보다 작은수잖아!");
		}else {
			System.out.println(num+"은 10보다 크거나 같음.");
		}
	}
}
