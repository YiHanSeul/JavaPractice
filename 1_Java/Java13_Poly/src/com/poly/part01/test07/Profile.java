package com.poly.part01.test07;

public class Profile {
	//필드
	private String name;
	private String phone;
	//생성자
	
	public Profile() {}

	public Profile(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	public void printProfile() {
		System.out.println("이름 :"+name);
		System.out.println("전화번호 :"+phone);
	}
	//매소드
}
