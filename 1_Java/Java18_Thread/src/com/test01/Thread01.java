package com.test01;

public class Thread01 {

	public static void main(String[] args) {
		System.out.println("========main start========");

		/*MyThread m1= new MyThread();
		MyThread m2= new MyThread();
		m1.run();
		m2.run();*/
		
		Thread m1 =new Thread(new MyThread());
		Thread m2 =new Thread(new MyThread());
		m1.start();
		m2.start();
		System.out.println("========main stop=========");
	}

}

//동시에 하나의 프로그램안에서 여러 프로그램이 돌아감
class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("i=" + i);
		}
	}

}
