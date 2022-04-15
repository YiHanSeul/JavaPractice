package com.test.chap03.test02;

public class InitBlock {
	private String name="아이폰";
	private int price=200;
	private static String brand="애플";
	
	{
		name="갤럭시";
		price=300;
		brand="삼성";
		System.out.println("초기화블럭");
	}
	static {
		//name="배가";
		brand="LG";
	}
	//생성자
	//기본 생성자
	public InitBlock() {}
	//매개변수 있는 생성자 값전달받아서 초기화 할때 사용 객체를 만들때
	public InitBlock(String name,int price,String brand) {
		this.name=name;
		this.price=price;
		InitBlock.brand=brand;
	}
	
	public void information() {
		System.out.println(name +", "+price+", "+brand);
	}
	public void setName(String name) {
		this.name=name;// 매개변수로 받은 name을 필드 name에 저장
	}
	public String getName() {
		return this.name;
	}
}
