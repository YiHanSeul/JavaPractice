package com.poly.part01.test01;

//추상클래스를 상속받을때도 똑같이 extends를 사용함.
//단, 추상 메서드를 무조건 사용해야한다.
public class Dog extends Animal{
	
	//추상메서들를 구현하고 @Override도 해야함
	@Override
	public void bark() {
		System.out.println("멍멍멍");
	}
	
	
	//eat메서드는 추상메서드가 animal클래스에서 아니라서 필수아님.
	@Override
	public void eat(String animal) {
		super.eat(animal);
	}
}
