package com.model.vo;

public class Member {
	private	String name;
	private int age;
	private char gender;
	private int couponCount;
	
	public Member() {}

	public Member(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getCouponCount() {
		return couponCount;
	}

	public void setCouponCount(int couponCount) {
		this.couponCount = couponCount;
	}

	@Override
	public String toString() {
		String g=null;
		if(gender=='w') {
			g="여성";
		}else {
			g="남성";
		}
		return "[이름 :" + name + ", 나이 :" + age + ", 성별 :" + g + ", 쿠폰갯수 :" + couponCount + "]";
	};
	
}
