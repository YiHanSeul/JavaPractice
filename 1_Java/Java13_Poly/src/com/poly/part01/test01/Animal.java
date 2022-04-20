package com.poly.part01.test01;

//추상메서드가 1개이상이면 abstract를 클래스에도 무조건 추가해줘야함.
public abstract class Animal {
	public void eat(String animal) {
		System.out.println(animal+" 먹는다.");
	}
	
	public abstract void bark();
}
