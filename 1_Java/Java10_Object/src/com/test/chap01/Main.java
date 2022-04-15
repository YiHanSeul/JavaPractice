package com.test.chap01;

public class Main {

	public static void main(String[] args) {
		Account my =new Account();
		Account your=new Account();
		//현재 잔액조회
		my.display();

		//입금
		my.in(100);
		my.display();
		
		my.in(150);
		my.display();
		
		//출금
		my.out(50);
		my.display();

		//변수를 private로 해서 직접적인접근은 불가능함.
		//my.balance-=200;
		
		my.out(50);
		my.display();
	}

}
