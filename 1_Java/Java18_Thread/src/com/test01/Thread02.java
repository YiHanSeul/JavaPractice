package com.test01;

class MyThread02 extends Thread{
	public MyThread02(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=0; i<100;i++) {
			System.out.println(this.getName()+" = "+i);
		}
		System.out.println(this.getName()+"출력 끝!");
	}
}
public class Thread02 {
	public static void main(String[] args) {
		MyThread02 m1=new MyThread02("야옹"); //기본생성자일경우 알아서 처리됨 하지만 다른 생성자가 같은 생성자 명으로 포함되어있으면 오류남.
		MyThread02 m2=new MyThread02("멍멍");
		
		//Thread Scheduling
		//우선순위(Priority), 순환할당(rount_robin)
		//순환할당은 JVM에 의해 결정. 개발자 임의로 수정 불가
		m1.setPriority(10);
		m2.setPriority(Thread.MIN_PRIORITY);//min_priority는 1임 낮은 숫자일수록 우선순위가 높다.
		m1.start();
		m2.start();
	}
}
