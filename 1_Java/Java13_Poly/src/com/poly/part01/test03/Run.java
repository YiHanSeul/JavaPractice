package com.poly.part01.test03;

public class Run {

	public static void main(String[] args) {
		Cat cat =new Cat();
		cat.bark();
		cat.eat("츄르");
		
		Dog dog=new Dog();
		dog.bark();
		dog.eat("개껌");
		
		Animal a=new Cat();
		a.bark(); //animal에서 실행을 하지만 알아서 찾아줌
		a=new Dog();
		a.bark();
	}

}
