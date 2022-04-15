package com.test01;

import java.util.Scanner;

public class ForTest02 {

	public static void main(String[] args) {
//		ForTest02.testFor1();
//		ForTest02.testFor2();
		// ForTest02.testFor3();
		ForTest02.testFor4();
	}

	public static void testFor1() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println("i= " + i + ", j=" + j);
			}
		}
	}

	public static void testFor2() {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			}
			System.out.println();
		}
	}

	public static void testFor3() {
		for (int r = 1; r <= 5; r++) {
			for (int c = 1; c <= 5; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void testFor4() {
		Scanner input = new Scanner(System.in);
		System.out.println("ÁÙ¼ö");
		int row = input.nextInt();
		System.out.println("Ä­¼ö");
		int col = input.nextInt();
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				if (i == j) {
					System.out.print(i);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
