package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext factory= new ClassPathXmlApplicationContext("com/test04/applicationContext.xml");
		Person m=factory.getBean("man",Person.class);
		Person w=factory.getBean("woman",Person.class);
		
		System.out.println("여자");
		w.classWork();
		System.out.println("============");
		System.out.println("남자");
		m.classWork();
	}
}
