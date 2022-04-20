package com.poly.part01.test06;

import java.util.Scanner;

public class Triangle extends AreaImpl {

	@Override
	public void make() {
		Scanner input= new Scanner(System.in);
		System.out.println("¹Øº¯: ");
		int x=input.nextInt();
		System.out.println("³ôÀÌ: ");
		int y=input.nextInt();
		
		double res=x*y/2.0;
		
		setResult(String.format("»ï°¢ÇüÀÇ %.2f", res));
		//super.print();
		
	}

}
