package com.test01;

public class Variable06 {
	public static void main(String[] args) {
		// (바꿀자료형)값, (바꿀자료형)변수
		Variable06 test = new Variable06();

		//test.test1();
		//test.test2();
		test.test3();
	}

	public void test1() {
		boolean flag = true;
		// flag = (boolean)100;

		// 자동형변환(묵시적형변환, upcasting)
		int num = 'A'; // 65
		System.out.println(num);

		char ch = 97; // a
		System.out.println(ch);

		char ch2 = (char) num;
		System.out.println(ch2);

		int num2 = -97;
		char ch3 = (char) num2;
		System.out.println(ch3);

	}
	public void test2() {
		int inum = 10;
		long lnum = 100;
		
		int isum =(int) (inum + lnum);
		System.out.println(isum);
		
		int isum2 =inum +(int)lnum;
		System.out.println(isum2);
		
		long lsum =inum +lnum;
	
	}
	public void test3() {
		//정수 -> 실수 형변환
		long lnum = 100;
		float fnum= lnum;
		System.out.println(fnum);

		//실수 -> 정수 형변환
		double dnum =10.5;
		int inum=(int)dnum;
		
		System.out.println(inum);
		
	}
}
