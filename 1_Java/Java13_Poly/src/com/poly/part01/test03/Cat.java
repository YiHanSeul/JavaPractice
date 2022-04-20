package com.poly.part01.test03;

public class Cat implements Animal{

	@Override
	public void bark() {
		System.out.println("具克具克");
	}

	@Override
	public void eat(String feed) {
		System.out.println(feed+" 冈绰促!");
	}

}
