package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		Address yi=(Address)factory.getBean("yi");
		Address hong=(Address)factory.getBean("hong");
		
		
		System.out.println(yi);
		System.out.println(hong);
		System.out.println(yi.toString());
		System.out.println(hong.toString());
		
		
	}

}
