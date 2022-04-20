package com.poly.part01.test04;

public class MTest {

	public static void main(String[] args) {
		Animal a=new Cat();
		a.bark();
		a.eat("생선");
		
		a=new Dog();
		a.bark();
		a.eat("뼈다귀");
		//부모클래스에서 bite에서 물려받거나, 재정의 , 추상매서드 바디부분을 완성하는 그런부분이 아님. 그래서 실행이 안됨.
		//a.bite();
		//다운캐스팅  animal 부모에 없기 때문에 형변환을 해줌 자식한테만 있어서
		((Dog)a).bite();
		
		a=new Eagle();
		a.bark();
		a.eat("비둘기");
		//animail타입으로 변수를 만들어 줘서 fly가 animal에 없어서 실행안됨. 
		//a.fly();
		//다운캐스팅 포장지 벗기기
		((Eagle)a).fly();
	}

}
