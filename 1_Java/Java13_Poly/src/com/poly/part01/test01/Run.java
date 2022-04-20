package com.poly.part01.test01;

public class Run {

	public static void main(String[] args) {
		Cat cat=new Cat();
		Dog dog=new Dog();
		
		cat.bark();
		dog.bark();
		
		cat.eat("강아지");
		dog.eat("고양이");
	}

}
