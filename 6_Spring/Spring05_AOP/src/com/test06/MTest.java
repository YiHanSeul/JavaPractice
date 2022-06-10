package com.test06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory =new ClassPathXmlApplicationContext("com/test06/applicationContext.xml");
		
		Person w=factory.getBean("woman",Person.class);
		Person m=factory.getBean("man",Person.class);
		System.out.println("여자");
		w.classWork();
		System.out.println("남자");
		System.out.println("=========");
		m.classWork();
	}

}
