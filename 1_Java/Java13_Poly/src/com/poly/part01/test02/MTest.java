package com.poly.part01.test02;

import java.util.Scanner;

public class MTest {

	public static void main(String[] args) {
		System.out.println("선택 [1:고양이 2:멍멍이  3:송아지");
		Scanner input = new Scanner(System.in);
		int select = input.nextInt();

		Base base = null;// 레퍼런스 변수

		switch (select) {
		case 1:
			base = new Cat();
			break;
		case 2:
			base = new Dog();
			break;
		case 3:
			base = new Cow();
			break;
		}
		base.start();
		base.stop();
		/*  다형성을 사용하지 않는다면 코드가 길어짐
		Cat cat =null;
		Dog dog =null;
		switch (select) {
		case 1:
			cat=new Cat();
			break;
		case 2:
			dog = new Dog();
			break;
		case 3:
			base = new Cow();
			break;
			
		if(cat !=null){
		cat.start();
		cat.stop();
		}
		*/
	}

}
