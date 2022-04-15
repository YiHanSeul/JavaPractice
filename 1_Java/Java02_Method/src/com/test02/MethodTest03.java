package com.test02;

import com.test01.MethodTest01;

public class MethodTest03 extends MethodTest01{
	public static void main(String[] args) {
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		//MethodTest01.defaultMethod();
		//MethodTest01.privateMethod();
		
		//non static :  class 변수명 =new class();
		//변수명.메소드명();
		MethodTest01 test =new MethodTest01();
		test.NonStaticMehtod();
	}
}
