package com.test.chap01;

public class Account {
	//멤버변수 ( 필 드 )
	private String name ="이한슬";
	private String accNo="123-456-7890";
	private String pwd="1234";
	private int bankCode=20;
	private int balance=0;
	
	//생성자(객체를 생성하기위한 메서드중 하나임.) 리턴타입이 없음 
	public Account(){}
	//Account ac=new Account(); //Account() <- 생성자임.
	
	//입금
	public void in(int money) {
		if(money>0) {
			balance+=money;
			System.out.println(name+"님의 계좌에"+money+"원이 입금 되었습니다.");
		}else {
			System.out.println("잘못된 금액이 입력 되었습니다.");
		}
		
	}
	//출금
	public void out(int money) {
		if(money<balance) {
			balance-=money;
			System.out.println(name+"님의 계좌에서"+money+"원이 출금 되었습니다.");
		}else {
			System.out.println("출금하려는 금액이 잔액보다 큽니다.");
		}

	}
	//잔액조회
	public void display() {
		int no=0;
		System.out.println(name+"님의 계좌 잔액은 "+balance+"원 입니다.");
	}
}
