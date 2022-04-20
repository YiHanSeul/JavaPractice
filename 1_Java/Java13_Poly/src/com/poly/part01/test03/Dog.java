package com.poly.part01.test03;

//인터페이스를 상속받을때는 implements
public class Dog implements Animal{

	@Override
	public void bark() {
		System.out.println("멍멍");
	}

	@Override
	public void eat(String feed) {
		System.out.println(feed+" 먹는다!!");
	}

}
