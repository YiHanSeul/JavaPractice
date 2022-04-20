package com.poly.part01.test04;

//추상클래스 상속, 인터페이스 상속 하나씩 받음. 인터페이스를 여러개 상속 받을수있음
public class Eagle extends Animal implements Bird{

	@Override
	public void bark() {
		System.out.println("끼요옷");
	}

	@Override
	public void fly() {
		System.out.println("파닥파닥");
	}

}
