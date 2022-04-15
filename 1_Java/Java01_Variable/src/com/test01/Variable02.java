package com.test01;

import java.util.Scanner;

public class Variable02 {
	public static void main(String[] args) {
		Variable02 test = new Variable02();
		test.inputTest();
	}

	public void inputTest() {
		Scanner input = new Scanner(System.in);
		System.out.println("name :");
		String name = input.nextLine();

		System.out.println("age :");
		int age = input.nextInt();

		System.out.println("height :");
		double height = input.nextDouble();
		System.out.println("name : " + name + "\nage : " + age + "\nheight : " + height);
		
		input.close();
	}
}
