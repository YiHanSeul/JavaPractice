package com.test09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MTest {
	public static void main(String[] args) {
	
		ApplicationContext factory=new ClassPathXmlApplicationContext("com/test09/applicationContext.xml");
		System.out.println("spring bean containser 생성완료");
		TV tv=(TV)factory.getBean("samsung");
		tv.powerOn();
		tv.powerOff();
		tv.volDown();
		tv.volUp();
	}
	
}
