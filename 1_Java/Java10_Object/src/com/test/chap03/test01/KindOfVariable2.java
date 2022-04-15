package com.test.chap03.test01;

public class KindOfVariable2 {
	
	public static int statisNum;
	public static final int STATIC_NUM=1;
	//public 접근제한자에 static+final 키워드를 함께 사용하는 것을
	//'상수 필드'
	public void methodTest() {
		//static int localStaticNum;
	}
	public static void staticMethodTest() {
		//지역변수라서 사용불가능 왜냐하면 stack영역에 있어서
		//static int localStaticNum;
	}
}
