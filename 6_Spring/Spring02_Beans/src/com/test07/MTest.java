package com.test07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test07/applicationContext.xml");
		
		Developer yi=factory.getBean("yihs",Developer.class);
		Engineer kim=factory.getBean("kimhs",Engineer.class);
		System.out.println(yi);
		System.out.println(kim);
	}

}
