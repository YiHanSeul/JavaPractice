package com.poly.part01.test06;

import java.util.Scanner;

public class Square extends AreaImpl {

	@Override
	public void make() {
		Scanner sc=new Scanner(System.in);
		System.out.println("밑변 입력: ");
		int x=sc.nextInt();
		System.out.println("높이 입력: ");
		int y=sc.nextInt();
		
		int res=x*y;
		
		setResult(String.valueOf(res));
	}

	@Override
	public void print() {
		System.out.println("사각형의 ");
		super.print();
	}
}
