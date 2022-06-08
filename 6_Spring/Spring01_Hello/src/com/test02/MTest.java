package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		//beans.xml에 설정해뒀던 bean 담아두기
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/beans.xml"); //bean들을 만들고
		
		MessageBean bean= (MessageBean)factory.getBean("korean"); //bean에서 일치한 korean bean을 가져옴
		bean.sayHello("스프링");
		
		bean=(MessageBean)factory.getBean("english");
		bean.sayHello("spring");
	}
}
