package com.test01;

public class MethodTest01 {
	public static void main(String[] args) {
		//static method 실행
		//클래스명.메소드명();
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		MethodTest01.privateMethod();
		
		MethodTest01 test =new MethodTest01();
		test.NonStaticMehtod();
	}
	//어디서나 접근,(+)
	public static void publicMethod() {
		System.out.println("public Method");
	}
	
	//상속일 경우 : 상속된 곳에서 (#)
	//상속이 아닌 경우 : 상속이 아닌경우 같은 패키지 내에서
	protected static void  protectedMethod() {
		System.out.println("protected Method");
	}
	//같은 패키지 내에서 (default)
	static void defaultMethod() {
		System.out.println("static default Method");
	}
	
	//현재 클래스 내에서만(-)
	private static void privateMethod() {
		System.out.println("private Method");
	}
	public void NonStaticMehtod() {
		System.out.println("NonStatic Method");
	}
}
