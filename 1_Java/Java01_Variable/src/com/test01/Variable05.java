package com.test01;

public class Variable05 {
	public static void main(String[] args) {
		Variable05 test = new Variable05();

		test.testOverflow();
	}

	public void testOverflow() {
		// byte bnum = 128;
		byte bnum = 127;

		bnum = (byte)((bnum + 1)*(-1));
		
		System.out.println(bnum);
	}
}
