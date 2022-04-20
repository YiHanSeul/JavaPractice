package com.poly.part01.test06;

import java.util.Scanner;

public class Circle extends AreaImpl {

	@Override
	public void make() {
		Scanner input = new Scanner(System.in);
		System.out.print("반지름을 입력하세요");
		int r = input.nextInt();

		double res = r * r * Math.PI; // 면적
		
		//super.setResult(res+"");
		setResult(String.format("%.2f", res));
	}
	@Override
	public void print() {
		System.out.print("원의 ");
		super.print();
	}
}
