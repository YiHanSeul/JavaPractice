package com.poly.part01.test04;


//추상클래스는 일반적인 매소드 들어가도됨.
public abstract class Animal {
	public abstract void bark();
	
	public void eat(String feed) {
		System.out.println(feed+" 먹는다!");
	}

}
