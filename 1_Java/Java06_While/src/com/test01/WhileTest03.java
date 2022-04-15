package com.test01;

public class WhileTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhileTest03 wt = new WhileTest03();

		//wt.prn01();
		//wt.prn02();
		wt.prn03();
	}

	public void prn01() {
		int i=100;
		do {
			System.out.print(i+", ");
			i--;
		}while(i!=0);
	}

	public void prn02() {
		int i=0;
		do {
			i++;
			if(i%2==0) {
			System.out.print(i+", ");
			}
		}while(i!=100);
	}

	public void prn03() {
		int i=1;
		int count =0;
		int sum =0;
		do {
			i++;
			if(i%7==0) {
				System.out.print(i+", ");
				count++;
				sum +=i;
			}
		}while(i!=100);
		System.out.println("count : "+ count+"  sum : "+sum);
	}

}
